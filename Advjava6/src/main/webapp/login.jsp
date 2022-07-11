<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>




<%@page import="java.sql.*,java.util.*"%>
<%
String username1=request.getParameter("username"); 
session.putValue("username",username1); 
//String Name=request.getParameter("name"); 
//session.putValue("name",Name); 
//long mobileno=Long.parseLong(request.getParameter("mobileno")); 
//session.putValue("mobileno",mobileno); 
String email1=request.getParameter("email");
session.putValue("email",email1); 
String password=request.getParameter("password"); 
session.putValue("password",password);
Class.forName("com.mysql.jdbc.Driver"); 
java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","cdac"); 
Statement st= con.createStatement(); 
//ResultSet rs=st.executeQuery("select * from users where username='"+username1+"' and password='"+password+"'");
ResultSet rs=st.executeQuery("select * from tbl_customer where username='"+username1+"' and password='"+password+"'");
try{
	rs.next();
	        if(rs.getString("password").equals(password)&&rs.getString("username").equals(username1)) 
			{ 
			      out.println("Welcome "  +username1); 
			     //out.println("Name "  +Name); 
			      //out.println("mobileno "  +mobileno); 
			     //out.println("email "  +email1); 
			     //out.println("password "  +password); 
			      
			} 
		else{
			 out.println("Invalid password or username.");
		    }
}
catch (Exception e) {
e.printStackTrace();
}
%>