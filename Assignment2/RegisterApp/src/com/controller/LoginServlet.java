package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.User;
import com.dao.Userdao;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		User u = new User();
		u.setUserName(username);
		u.setPassword(password);
		Userdao userdao = new Userdao();
		boolean status=userdao.validate(u);
		if(status) {
			
			out.println("welcome "+username);
		}
		else{
			 RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
	    	  rd.include(request, response);
	    	  out.println("<center><h3>Please Register</h3></center>");
		}

		}

	}


