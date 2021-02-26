package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Period;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Validation implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		PrintWriter out = response.getWriter();
		String name = request.getParameter("uname");
		String Dob = request.getParameter("dob");
		LocalDate birthdate = LocalDate.parse(Dob);
		LocalDate now = LocalDate.now();
		Period diff = Period.between(birthdate, now);
		int age = diff.getYears();

		if (name.matches("[a-zA-Z]+")) {
			if (age > 18) {
				request.setAttribute("Age", age);
				chain.doFilter(request, response);
			} else {
				redirect(request, response);
				out.println("<center><h2>Age must be greater than 18</h2></center>");
			}
		} else {
			redirect(request, response);
			out.println("<center><h2>User name should contain only letters</h2></center>");
		}
	}

	private void redirect(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("Register.jsp");
		rd.include(request, response);
	}

}
