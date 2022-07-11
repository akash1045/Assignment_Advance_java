package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login.cdac")
public class Login extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				
		String username=request.getParameter("u1");
		int password=Integer.parseInt(request.getParameter("p1"));
	   

		PrintWriter out = response.getWriter();
		

		out.write("<html><body>");
		out.write("<h1>Succesful login"+"</h1>");
		out.write("</body></html>");
	}
}


