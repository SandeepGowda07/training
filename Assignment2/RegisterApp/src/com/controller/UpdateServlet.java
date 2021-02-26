package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Period;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.User;
import com.dao.Userdao;


public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
       public UpdateServlet() {
        super();
    }
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int userid=Integer.parseInt(request.getParameter("userid"));
		String username=request.getParameter("uname");
		String Emailid=request.getParameter("email");
		String Dob=request.getParameter("dob");
		String password=request.getParameter("pass");
		PrintWriter out=response.getWriter();
		
		LocalDate birthdate=LocalDate.parse(Dob);
		LocalDate now = LocalDate.now();
		Period diff= Period.between(birthdate, now);
		int age=diff.getYears();
		User user=new User(username, Emailid, Dob, age, password,userid);
		Userdao userdao=new Userdao();
		int status=userdao.update(user);
		if(status>0) {
			 RequestDispatcher rd=request.getRequestDispatcher("Admin.jsp");
	    	  rd.include(request, response);
	    	  out.println("<center><h3>Updated</h3></center>");
		}else {
			out.println("Not Updated");
	
		}
	
	}
	}


	
