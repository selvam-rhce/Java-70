package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableOracle {

	public static void main(String[] args) throws Exception{
		//Initialize an appropriate JDBC Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Connect to DB Server
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",	"java70","password");
		System.out.println("Connected to DB Server!");
		
		//Create an Object for passing SQL Queries
		Statement st = con.createStatement();
		
		String sql = "create table emp(empno number(5), ename varchar(25), sal number(10,2), primary key (empno))";
		
		try {
			st.execute(sql);
			System.out.println("DB Table Created!");
		}
		catch(Exception ex) {
			System.out.println(ex.toString());
		}
		
		//close connection with DB
		st.close();
		con.close();
	}
}
