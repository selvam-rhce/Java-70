package co.edureka.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchExec {

	public static void main(String[] args) throws Exception {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@SUNIL:1521:XE", "java70", "password");
		Statement st = con.createStatement();
		
		con.setAutoCommit(false);
		
		st.addBatch("insert into emp values(101,'Sunil',2500)");
		st.addBatch("insert into emp values(102,'Anil',3500)");
		//st.addBatch("insert into emp values(103,'Naveen',4500)");
		st.addBatch("insert into emp values(101,'Naveen',4500)");
		st.addBatch("update emp set sal = 50000");
		
		try {
			st.executeBatch();
			System.out.println("DB operations performed!");
			con.commit();
		}
		catch(Exception ex) {
			System.out.println(ex.toString());
			con.rollback();
		}
		
		st.close();
		con.close();
	}

}
