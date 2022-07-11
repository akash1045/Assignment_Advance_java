package com.cdac9.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class loginservice {



	public boolean CheckUsernameExists(String username) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "cdac");

			boolean present = false;
			
			PreparedStatement pst = conn.prepareStatement("select count(*) from tbl_customer where username = ?");
			pst.setString(1, username);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				int c = rs.getInt(1);
				if(c == 1)
					present = true;
			}
			return present;
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return false;
		}
		finally {
			try { conn.close(); } catch(Exception e) { }
		}
	}      
}
 
