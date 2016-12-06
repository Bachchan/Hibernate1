package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import javax.servlet.http.HttpSession;

import model.Student;
import service.RegistrationServise;


public class RegisterServlet extends HttpServlet {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = -4962283306281154740L;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		int stNo;
		
		
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out=resp.getWriter();
		 try {       	
			    String sFN=req.getParameter("firstName");
	            String sMN=req.getParameter("middleName");
	            String sLN=req.getParameter("lastName");
	            Student student = new Student();
	            student.setsFirstName(sFN);
	            student.setsMiddleName(sMN);
	            student.setsLastName(sLN);
	            HttpSession session = req.getSession();
	            System.out.println("Session  (Register Servlet))"+session.getId());
	            session.setAttribute("user",null);
	            RegistrationServise service = new RegistrationServise();
	            stNo= service.saveStudentRegistration(student);
	            ArrayList<Student> list=service.showData();
	            req.setAttribute("allStudent", list);
	            req.setAttribute("StudentId", stNo);  
	            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/RegSuccessfull.jsp");
	            		requestDispatcher.forward(req, resp);
	            		
	        } catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {            
	            out.close();
	        }
		
	}
	
}
