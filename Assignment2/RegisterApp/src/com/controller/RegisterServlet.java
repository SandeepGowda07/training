package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Period;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.User;
import com.dao.Userdao;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("uname");
		String Emailid = request.getParameter("emailid");
		String Dob = request.getParameter("dob");
		String password = request.getParameter("pass");
		PrintWriter out = response.getWriter();
		int age = (Integer) request.getAttribute("Age");

		User user = new User(username, Emailid, Dob, age, password);
		Userdao userdao = new Userdao();
		int i = userdao.adduser(user);
		if (i > 0) {
			redirect(request, response);
			out.println("<center><h3>Registered Succesfully</center></h3>");
		} else {
			redirect(request, response);
			out.println("<center><h3>Username already exists</h3></center>");
		}
	}

	private void redirect(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.include(request, response);
	}
}
