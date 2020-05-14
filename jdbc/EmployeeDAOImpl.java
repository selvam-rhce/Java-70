package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static Statement st = null;
	
	/*--- constructor ---*/
	public EmployeeDAOImpl() throws Exception{
		//connect to DB Server
		Connection con = ConnectionFactory.getConnection();
		st = con.createStatement();
	}
	@Override
	public void saveEmp(Employee emp) throws Exception {
		String sql = "insert into emp values("+emp.getEmpno()+",'"+emp.getEname()+"',"+emp.getSal()+")";
		int n = st.executeUpdate(sql);
		if(n>0)
			System.out.println("Employee Saved!");
	}

	@Override
	public void updateEmp(Employee emp) throws Exception {
		String sql = "update emp set ename='"+emp.getEname()+"', sal="+emp.getSal()+" where empno="+emp.getEmpno();
		int n = st.executeUpdate(sql);
		if(n>0)
			System.out.println("Employee Updated!");
	}

	@Override
	public void deleteEmp(int eno) throws Exception {
		String sql = "delete from emp where empno="+eno;
		int n = st.executeUpdate(sql);
		if(n>0)
			System.out.println("Employee Deleted!");
		else
			System.out.println("No matching Employee found!");
	}

	@Override
	public Employee searchEmp(int eno) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployees() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
