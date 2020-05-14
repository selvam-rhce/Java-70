package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecord {
 public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver"); 
		
		String url = "jdbc:mysql://localhost:3306/edureka";
		String userName = "root";
		String password = "";
		
		Connection con = DriverManager.getConnection(url,userName,password);
		
		Statement st = con.createStatement();
		
		//String sql = "insert into emp values(101,'Sunil',2500.5)";
		String sql = "insert into emp(empno,ename,sal) values(102,'Naveen',3500.5),(103,'Harsha',4500.5),"
				+ "(104,'Sachin',4500),(105,'Praveen',7500)";
		
		try {
			int rows_affected = st.executeUpdate(sql);
			System.out.println("Employee Saved - "+ rows_affected);
		}
		catch(Exception ex) {
			System.out.println("Error: DB Table could not be created - "+ex.getMessage());
		}
		
		st.close();
		con.close();			 
 }
}
