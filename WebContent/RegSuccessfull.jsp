<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="model.Student" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success full</title>

</head>
<body>
<fieldset><legend>User</legend>
<div align="right"><a href ="Registration.jsp">Back</a></div>
<center>
<h1>Thanks to register</h1>
Your Id is: <%=request.getAttribute("StudentId") %>


<h3><a href="SearchServlet">Go To Student Details Page</a></h3>
</center></fieldset>
</body>
</html>