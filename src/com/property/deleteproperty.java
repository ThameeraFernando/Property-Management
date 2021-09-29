package com.property;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/deleteproperty")
public class deleteproperty extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pid= request.getParameter("id");
		
		boolean issuccess=propertyDButill.deleteproperty(pid);
		
		if(issuccess==true) 
		{
			RequestDispatcher dis1= request.getRequestDispatcher("viewproperty.jsp");
			dis1.forward(request, response);
		}
		else 
		{
			RequestDispatcher dis2= request.getRequestDispatcher("addunsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}
