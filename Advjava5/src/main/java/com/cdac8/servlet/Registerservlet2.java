package com.cdac8.servlet;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdac.service.Registerservice;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/login2.cdac")
public class Registerservlet2 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		Long mobileno = Long.parseLong(request.getParameter("mobileno"));
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		PrintWriter out = response.getWriter();
		out.write("<html><body>");

		Registerservice registerService = new Registerservice();
		boolean present = registerService.isCustomerPresent(email);
		if(present) {
			out.write("<h1>It seems you are already a registered user!</h1>");
		}
		else {
			registerService.register(name, email, mobileno, username, password);
			out.write("<h1>Registration successful!</h1>");
		}

		out.write("</body></html>");
	}

}

