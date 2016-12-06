<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<script type="text/javascript">
function validateForm() {
    var name = document.forms["loginform"]["name"].value;
    var password = document.forms["loginform"]["pass"].value;
    if (name == null || name == "") {
        alert("Name is mandatory");
    }
    
    if (password == null || password == "") {
        alert("Password required");
        return false;
    }
    var frm = document.getElementsByName('loginform')[0];
    frm.submit(); // Submit
    frm.reset();  // Reset
   return false; //
}</script>
</head>
<body>
<div align="left"><a href="Home.jsp">Back</a> | <a href="Home.jsp">Home</a></div>
<center>
<form action="loginServlet" method="post" name="loginform">
        <fieldset style="width: 300px">
            <legend> Login </legend>
            <table>
                <tr>
                    <td>User ID</td>
                    <td><input type="text" name="name"  /></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="pass"  /></td>
                </tr>
                <tr>
                    <td><input type="button" value="Login" onclick="validateForm()"></td>
                </tr>
            </table>
        </fieldset>
    </form>
</center>
</body>
</html>