<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
<script type="text/javascript">

function registration(){
    window.location = '/AutoIncrementfromDb/Registration.jsp';
}
function login(){
    window.location = '/AutoIncrementfromDb/Login.jsp';
}</script>
</head>
<body>
<center>
<fieldset style="width: 300px">
<legend> Login </legend>
<table border="1">
<tr><td colspan="2" height=100 width=100 bgcolor="pink"><center><h1>HOME PAGE</h1></center></td></tr>
<tr><td><input type="button" value="New Registration" onclick=registration() ></td><td><input type="button" value="Login" onclick=login() ></td></tr></table>
</fieldset>
</center>
</body>
</html>