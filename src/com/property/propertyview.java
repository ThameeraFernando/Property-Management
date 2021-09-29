package com.property;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/propertyview")
public class propertyview extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public propertyview() {
        super();
        
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			List<property> prodetails= propertyDButill.getpropertydetails();
			request.setAttribute("prodetails",prodetails);

		} 
				catch (Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis2= request.getRequestDispatcher("view.jsp");
		dis2.forward(request, response);
	}
     
}
