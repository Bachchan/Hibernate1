<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="model.Student" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Display</title>

</head>
<body>
<form action="display" method="get" name="frmdisplay">
<center><h1>Thanks to register</h1>
<table><tr><td>Your Id is: </td><td><%request.getAttribute("StudentId"); %></td>
  <%
  List<Student> studentObject=(List<Student>)request.getAttribute("allStudent");
  %>
<td><% %></td></tr></table>
     <table border="1">
             <tr>
               <td>Student Id</td>
               <td>First Name</td>
               <td>Middle Name</td>
               <td>Last Name</td>
             </tr>
        
       <% for (Student st : studentObject ) { %>
             <tr>
                <td><%=st.getSID() %></td>
               <td><%=st.getsFirstName() %></td>
               <td><%=st.getsMiddleName()%></td>
               <td><%=st.getsLastName() %></td>
               
             </tr>
     <% }%>
     
     
 </table>

 </center>

</form>
</body>
</html>