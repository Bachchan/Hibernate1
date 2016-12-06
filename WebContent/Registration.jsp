<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page import="java.util.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
<div align="left"><a href="Home.jsp">Back</a> | <a href="Home.jsp">Home</a> </div><div align="right"></div>
	<center>
		<form method="post" action="registration" >
			<fieldset>
				<legend>New Registration</legend>
				<table>
					<tr>
						<td>Student Name :</td>
						<td><input type="text" name="firstName"  size="50"></td>
					</tr>
					<tr>
						<td>Student Middle Name:</td>
						<td><input type="text" name="middleName"  size="50"></td>
					</tr>
					<tr>
						<td>Student Last Name:</td>
						<td><input type="text" name="lastName" size="50"></td>
					</tr>
					<tr>
					    <td>Student Photo:</td>
						<td><input type="file" name="photo" size="50"></td>
					
						<td colspan="2">
                        <input type="submit" value="Save">
                    </td>
						<td><input type="reset" value="reset"></td>
					</tr>
				</table>
			</fieldset>
		</form>
	</center>
</body>

</html>