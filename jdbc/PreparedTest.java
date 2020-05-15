package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedTest {

	public static void main(String[] args) throws Exception{
		Connection con = ConnectionFactory.getConnection();
		Scanner sc = new Scanner(System.in);

		PreparedStatement pst = con.prepareStatement("insert into emp values(?,?,?)");
		String req="Y";
		
		while(req.equalsIgnoreCase("Y")) {
		 System.out.println("enter empno, name,sal");	
		 
		 int eno = sc.nextInt(); 
		 String name = sc.next(); 
		 float sal = sc.nextFloat();
		 
		 //setting parameter values
		 pst.setInt(1, eno);
		 pst.setString(2, name);
		 pst.setFloat(3, sal);
		 
		 int rows_affected = pst.executeUpdate();
		 System.out.println("Employee Saved");
		 
		 System.out.print("do you want to save more employees?[Y/N]: ");
		 req= sc.next();
		}
	  sc.close();	 	
	  pst.close();
	  con.close();
	}
}
