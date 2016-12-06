package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import javax.servlet.http.HttpSession;

import persistence.Login;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1117445362315170245L;
	
	
	 public void doPost(HttpServletRequest request, HttpServletResponse response)  
	            throws ServletException, IOException {
		 
		    response.setContentType("text/html");  
	        PrintWriter out = response.getWriter(); 
	        
	        String name=request.getParameter("name");  
	        String pass=request.getParameter("pass"); 
	        if(request.getSession(false)==null){
	        	System.out.println("No Session Exist");
	        }
	       
	        Login login=new Login();
	       
	        if(login.validate(name, pass)){  	
	        	HttpSession session= request.getSession();
	        	session.setAttribute("user",name);
	        	request.setAttribute("userName", name);
	        	RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");  
	            rd.forward(request,response);  
	        }  
	        else{  
	            
	            RequestDispatcher rd=request.getRequestDispatcher("Home.jsp");
	            rd.include(request,response);  
	        }  

	        out.close();  
	        
	 }
	

}
