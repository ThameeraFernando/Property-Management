package com.property;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updateproperty")
public class updateproperty extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public updateproperty() {
        super();
        
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id= request.getParameter("id");
		String name= request.getParameter("name");
		String location= request.getParameter("location");
		String price= request.getParameter("price");
		String type= request.getParameter("type");
		String features= request.getParameter("features");
		
		
		double pprice=Double.parseDouble(price);
		
		
		boolean isupdate=propertyDButill.updateproperty(id, name, location, pprice, type, features);
		
		if(isupdate==true) 
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
