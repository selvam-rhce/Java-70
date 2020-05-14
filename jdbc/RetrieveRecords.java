package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveRecords {

	public static void main(String[] args) throws Exception{
		/*
		Class.forName("com.mysql.jdbc.Driver"); 
		
		String url = "jdbc:mysql://localhost:3306/edureka";
		String userName = "root";
		String password = "";
		
		Connection con = DriverManager.getConnection(url,userName,password);
		*/
		Connection con = ConnectionFactory.getConnection();
		
		Statement st = con.createStatement();
		
		String sql = "select * from emp";		
		
		try {
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getFloat("sal"));
				Thread.sleep(2000);
			}
		}
		catch(Exception ex) {
			System.out.println("Error: DB Table could not be created - "+ex.getMessage());
		}
		
		st.close();
		con.close();			 
	}
}
