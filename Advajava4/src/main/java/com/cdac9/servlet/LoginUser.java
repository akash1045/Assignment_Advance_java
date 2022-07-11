package com.cdac9.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdac9.servlet.loginservice;
/**
 * Servlet implementation class LoginUser
 */
@WebServlet("/login.cdac")
public class LoginUser extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//String login=request.getParameter("login");
		
	   loginservice log=new loginservice();
		boolean present=log.CheckUsernameExists(username);
	   if(present) {
		   PrintWriter out = response.getWriter();
			out.write("<html><body>");
			out.write("<h1>username is already present</h1>");
			out.write("</body></html>");
	   }
	   else {
		try {
			
		   
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "cdac");
			PreparedStatement st = conn.prepareStatement("insert into login(username, password) values(?, ?)");
			st.setString(1, username);
			st.setString(2, password);
			int i=st.executeUpdate();
			if(i>0) {
				PrintWriter out = response.getWriter();
				out.write("<html><body>");
				out.write("<h1>login is sucessded value is inserted!</h1>");
				out.write("</body></html>");
			}else {
				PrintWriter out = response.getWriter();
				out.write("<html><body>");
				out.write("<h1>login is not sucessded value is not inserted!</h1>");
				out.write("</body></html>");
			}
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		PrintWriter out = response.getWriter();
		out.write("<html><body>");
		out.write("<h1>welcome!</h1>");
		out.write("</body></html>");
		
	}
	
}
}
	

		
			
