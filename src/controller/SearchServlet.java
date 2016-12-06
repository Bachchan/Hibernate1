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

public class SearchServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1770411980658250964L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		resp.setContentType("text/html;charset=UTF-8");
		//resp.setContentType("text/pdf");
		PrintWriter out=resp.getWriter();
            HttpSession session=req.getSession(false);
               if (session.getAttribute("user")==null) 
                {
                	RequestDispatcher requestDispatcher = req.getRequestDispatcher("/Login.jsp");
            		requestDispatcher.forward(req, resp);
	        	}
	            else 
	            {
	        	String fname=req.getParameter("fname");  
		        try {       	
		            RegistrationServise service = new RegistrationServise();
		            if(fname==null)
		            {
		            	ArrayList<Student> list=service.displaySearch();           
			            req.setAttribute("allStudent", list);
			            
		            }
		            else
		            {
		            	ArrayList<Student> list=service.displaySearch(fname);           
			            req.setAttribute("allStudent", list);
			           
		            }
		           
		            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/Details.jsp");
		            		requestDispatcher.forward(req, resp);
		            		
		        } catch (Exception e) {
					e.printStackTrace();
				} finally {            
		            out.close();
		        }

			}
	}
}

