package co.edureka.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class ProcedureCall {

	public static void main(String[] args) {
		Connection con;
		CallableStatement cst;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@SUNIL:1521:XE", "java70", "password");
			
			cst = con.prepareCall("{call addNum(?,?,?)}");
			
			int x = 23;
			int y = 21;
			
			cst.setInt(1, x);
			cst.setInt(2, y);
			
			//register OUT parameter with type
			cst.registerOutParameter(3, Types.INTEGER);		
			
			cst.execute();
			
			System.out.println(x+" + "+y+" = "+ cst.getInt(3));
			
			cst.close();
			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
	}

}
