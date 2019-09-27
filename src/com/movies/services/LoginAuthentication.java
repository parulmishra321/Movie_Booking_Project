package com.movies.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LoginAuthentication {

	public static boolean validate(String name, String pass)
	{
		boolean status = false;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/movieticketbookingsystem", "root", "root");
			String sql = "select * from users where Email=? and Password=?";
			PreparedStatement ps = c.prepareStatement(sql);
			
			ps.setString(1, name);
			ps.setString(2, pass);
			
			ResultSet rs = ps.executeQuery();
			status = rs.next();
		
			
/*			System.out.println("After result "+rs.getFetchSize());
			String id = rs.getString("admin_user_Id");
			String pwd = rs.getString("admin_password");
			
			System.out.println("End");
*///			if(id.equals(name) && pwd.equals(pass))
//			{
//				status = true;
//			}
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return status;
	}
}
