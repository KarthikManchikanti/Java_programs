package com.login.dao;

import java.sql.*;
import java.sql.DriverManager;

public class LoginDao
{
	String sql= "select * from login where uname=? and pass=?";
	String url="jdbc:mysql://localhost:3305/karthik";
	String username="root";
	String pass="root";
	public boolean checkDetails(String uname, String password)
	{
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,pass);
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, uname);   //replacing the question marks
			ps.setString(2, password);
			ResultSet rs= ps.executeQuery();
			if(rs.next())
			{
				return true;
			}
			
		}
		catch (Exception e)
		{
			System.out.println("Exception" +e);
		}
		return false;
		
	}
}
