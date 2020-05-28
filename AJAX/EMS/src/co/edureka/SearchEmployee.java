package co.edureka;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

@WebServlet("/search")
public class SearchEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static PreparedStatement pst=null;
	
	public void init(ServletConfig config) throws ServletException{
		super.init(config);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edureka","root","");
			pst = con.prepareStatement("select ename,sal from emp where empno=?");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String eno = request.getParameter("eno");
		PrintWriter out = response.getWriter();
		try {
			pst.setString(1, eno);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				String name = rs.getString(1);
				String sal = rs.getString(2);
				
				response.setContentType("application/json");
				JSONObject jobj = new JSONObject();
				jobj.put("name", name);
				jobj.put("sal", sal);
				out.println(jobj);
			}
			else {
				out.print("");
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
