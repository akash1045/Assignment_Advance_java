package com.cdac.servlet;

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

/**
 * Servlet implementation class Login1
 */
@WebServlet("/login.cdac")
public class Login1 extends HttpServlet {
	
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String login=request.getParameter("login");
		String update=request.getParameter("update");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "cdac");
			
			if(login.equals("l")) {
				PreparedStatement st = conn.prepareStatement("insert into login(username, password) values(?, ?)");
				st.setString(1, username); //substituting ? with actual value
				st.setString(2, password);
				int i=st.executeUpdate();
				PrintWriter out = response.getWriter();
				if(i > 0)
				{
				 out.write("<html><body>");
				 out.write("<h1>Record inserted Successfully</h1>");
				 out.write("</body></html>");
				}
				else
				{
					out.write("<html><body>");
				    out.print("<h1>There is a problem in inserting Record.</h1>");
				    out.write("</body></html>");
				} 
				conn.close();
			}
			else {
				PreparedStatement st= conn.prepareStatement("Update users set username=?,password=?,where username="+username);
				
				st.setString(1,username);
				st.setString(2, password);
				
				int i = st.executeUpdate();
				PrintWriter out = response.getWriter();
				if(i > 0)
				{
				 out.write("<html><body>");
				 out.write("<h1>Record Updated Successfully</h1>");
				 out.write("</body></html>");
				}
				else
				{
					out.write("<html><body>");
				    out.print("<h1>There is a problem in updating Record.</h1>");
				    out.write("</body></html>");
				} 
				conn.close();
			}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			PrintWriter out = response.getWriter();
			out.write("<html><body>");
			out.write("<h1>Welcome!</h1>");
			out.write("</body></html>");
		}
		
	}

	

