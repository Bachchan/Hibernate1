<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="model.Student" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Details</title>
 <style type="text/css">
        table {
            width:  100%;
            border-collapse: collapse;
        }
        td {
            border: 1px solid black;
        }
        .scrollingTable {
            width: 30em;
            overflow-y: auto;
        }
    </style>
    
</head>
<body >
<fieldset onmouseover="student details"><legend>Student Details</legend>
<div align="right"><a href="Login.jsp">Logout</a></div>
<center><form action="display-imag" method="get">
<h1>YOUR DESIRED DATA </h1>

  <%
  List<Student> studentObject=(List<Student>)request.getAttribute("allStudent");
  %>
<hr color="red">
<br>
<div class="scrollingTable">
     <table border="1">
             <tr>
               <th>Student Id</th>
               <th>First Name</th>
               <th>Middle Name</th>
               <th>Last Name</th>
             </tr>
         
       <% for (Student st : studentObject ) { %>
             <tr>
             <% %>
                <td><%=st.getSID() %></td>
               <td><%=st.getsFirstName() %></td>
               <td><%=st.getsMiddleName()%></td>
               <td><%=st.getsLastName() %></td>
             </tr>
            
     <% }%>
    
     <tr><td colspan="4"><center><input  type="submit" name="submit" value="Image"></center></td>
     </tr>
     

 </table>
</div>
</form></center>
</fieldset>
</body>
</html>