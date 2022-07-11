<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" import="java.util.*"%>
<%
  String name=request.getParameter("name"); 
  String email=request.getParameter("email");
  long mobileno=Long.parseLong(request.getParameter("mobileno"));
  String username=request.getParameter("username");
  String password=request.getParameter("password");
  try
  {
  Class.forName("com.mysql.jdbc.Driver");
  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "cdac");
  Statement st=conn.createStatement();

  int i=st.executeUpdate("insert into tbl_customer(name,email,mobileno,username,password)values('"+name+"','"+email+"','"+mobileno +"','"+username+"','"+password+"')");
  out.println("Thank you for register ! Please <a href='login.html'>Login</a> to continue.");
  }
  catch(Exception e)
  {
  //System.out.println(e);
  e.printStackTrace();
  }
%>