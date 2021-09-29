package com.property;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbconnection {

	private static String url= "jdbc:mysql://localhost:3306/propertydb";
	private static String user="root";
	private static String password1="";
	private static Connection con;
	
	public static Connection CreateConnection() 
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection(url, user, password1);
			
			
		}
		catch (Exception e) {
			e.getStackTrace();
		}
		
		return con;
	}
}
