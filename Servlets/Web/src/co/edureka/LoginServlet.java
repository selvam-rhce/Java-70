package co.edureka;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static PreparedStatement pst = null;
	
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edureka","root","");
			pst = con.prepareStatement("select * from users where username=? and password=?");
		}
		catch(Exception ex) {
			System.out.println(ex.toString());
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get form data submitted by client
		String uid = request.getParameter("txtUid");
		String pwd = request.getParameter("txtPwd");
		
		try {
			pst.setString(1, uid);
			pst.setString(2, pwd);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				RequestDispatcher rd = request.getRequestDispatcher("admin");
				rd.forward(request, response);
				//response.sendRedirect("admin");
			}
			else {
				PrintWriter out = response.getWriter();
				out.println("<p style=text-align:center;font-size:20px;color:cyan>Invalid Username / Password</p>");
				RequestDispatcher rd = request.getRequestDispatcher("Login.html");
				rd.include(request, response);				
			}
		}
		catch(Exception ex) {
			System.out.println(ex.toString());
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
