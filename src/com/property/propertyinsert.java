package com.property;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/propertyinsert")
public class propertyinsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public propertyinsert() {
        super();
  
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String id =request.getParameter("id");
		String name =request.getParameter("name");
		String location=request.getParameter("location");
		String price=request.getParameter("price");
		String type=request.getParameter("type");
		String features=request.getParameter("features");
		
		
		double Price=Double.parseDouble(price);
		boolean isDone;
		isDone=propertyDButill.insertProperty(id,name, location, Price, type, features);
		
		if(isDone==true) 
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
