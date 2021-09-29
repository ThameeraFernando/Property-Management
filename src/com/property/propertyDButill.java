package com.property;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class propertyDButill {

	private static Connection con=null;
	private static Statement stm=null;
	private static ResultSet rs=null;
	
	
	public static boolean insertProperty(String id,String name,String location,double price,String type,String features) 
	{
		boolean isdone=false;
		
		
		
		try {
			
			con=dbconnection.CreateConnection();
			stm=con.createStatement();
			
			String sql="insert into propertydetails values('"+id+"','"+name+"','"+location+"','"+price+"','"+type+"','"+features+"')";
			int result=stm.executeUpdate(sql);
			
			if(result>0) 
			{
				isdone=true;
			}
			else
				isdone =false;
			
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return isdone;
		
	} 
	
	public static List<property> getpropertydetails()
	{
		ArrayList<property> pro=new ArrayList<property>();
		
		
		try {
			
			con=dbconnection.CreateConnection();
			stm=con.createStatement();
			
			String sql="select * from propertydetails";
			rs=stm.executeQuery(sql);
			
			while (rs.next()) {
				
				String id=rs.getString(1);
				String name=rs.getString(2);
				String location=rs.getString(3);
				String price=rs.getString(4);
				String type=rs.getString(5);
				String features=rs.getString(6);
				
				property p = new property(id, name, location, price, type, features);
				pro.add(p);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pro;
		
	}
	public static boolean updateproperty(String id,String name,String location,double price,String type,String features) 
	{
		boolean isdone=false;
		try {
			
			con=dbconnection.CreateConnection();
			stm=con.createStatement();
			
			String sql="update propertydetails set name='"+name+"',location='"+location+"',price='"+price+"',type='"+type+"',features='"+features+"'"+"where id='"+id+"'";
			
			int result=stm.executeUpdate(sql);
			
			if(result>0) 
			{
				isdone=true;
			}
			else
				isdone =false;
			
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return isdone;
	}
	
	public static boolean deleteproperty(String id) 
	{
		boolean isdone=false;
		
		try {
			
			con=dbconnection.CreateConnection();
			stm=con.createStatement();
			
			String sql="delete from propertydetails where ID='"+id+"'";
			
			int result=stm.executeUpdate(sql);
			
			if(result>0) 
			{
				isdone=true;
			}
			else
				isdone =false;
			
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return isdone;
	}
}
