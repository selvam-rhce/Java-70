package co.edureka;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/admin")
//@WebFilter("/*")
public class LoginFilter implements Filter {
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		/*
		String uid = request.getParameter("txtUid");
		String pwd = request.getParameter("txtPwd");
		System.out.println(uid+" - "+pwd);
		
		if(uid.contentEquals("admin") && pwd.contentEquals("123"))
		    chain.doFilter(request, response);
		else {
			PrintWriter out = response.getWriter();
			out.println("<p style=color:red;font-size:20px;text-align:center>Invalid Username/ Password</p>");
			RequestDispatcher rd = request.getRequestDispatcher("Login.html");
			rd.include(request, response);
		}
		*/
		PrintWriter out = response.getWriter();
		out.println("<h1 style=text-align:center;margin-top:220px>Server is under maintenance!!<br><br>Will be active @ 00.00AM</h1>");
	}


	public void init(FilterConfig fConfig) throws ServletException {}
	public void destroy() {	}	

}
