<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator</title>
</head>
<body>

<%
  int n1=Integer.parseInt(request.getParameter("num1"));
  int n2=Integer.parseInt(request.getParameter("num2"));
  int sum=n1+n2;

%>
<h1>Sum is <%=sum %></h1>

</body>
</html>