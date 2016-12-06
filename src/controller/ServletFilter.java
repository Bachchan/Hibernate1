package controller;
import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
public class ServletFilter implements Filter {

	@Override
	public void init(FilterConfig fConfig) throws ServletException {
		
	}
	

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain fchain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		
		//Get the IP address of client machine.
		String ipAddress = request.getRemoteAddr();
		//Log the IP address and current timestamp.
		System.out.println("IP "+ipAddress + ", Time " 
							+ new Date().toString());
		String url =request.getRequestURL().toString();
		System.out.println("URL : "+ url);
		String regURL =request.getRequestURL().toString();
		RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
		
	if((request.getSession(false) ==null && url.contains("Login.jsp") || url.contains("Registration.jsp")) || (request.getSession(false)!=null))
		{
			fchain.doFilter(req, resp);
		}else{
			 rd = request.getRequestDispatcher("Login.jsp");
			rd.forward(request, resp);
		}
		
		
		
		
	}
	
	@Override
	public void destroy() {
		
	}

}
