<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome </title>

</head>
<body>
   <fieldset><legend>WELCOME</legend>
   <div align="right"><a href="Login.jsp">Logout</a></div>
   <form method="get" name="frm" action="search"> <center><h3>!!! WELCOME !!!</h3>
    <h4>
         <%String UserName=(String) request.getAttribute("userName"); %>
         Hello Mr. <%=UserName %>
          <a href="SearchServlet">Go To Student Details Page</a>
          <table border="1" width="300" align="center">
           <tr><td colspan=2 style="font-size:12pt;" align="center">
             <h3>Search User</h3></td></tr>
             <tr><td ><b>User Name</b></td>
              <td>: <input  type="text" name="fname" >
             </td></tr>        
             <tr><td colspan=2 align="center">
             <input  type="submit" name="submit" value="Search"></td></tr>
          </table>
        </h4></center>
   </form></fieldset>
</body>
</html>
