package co.edureka.jdbc;

public class EmployeeDAOFactory {
 private static EmployeeDAO edao = null;
 public static EmployeeDAO getEmployeeDAO() throws Exception{
	 if(edao == null) {
		 edao = new EmployeeDAOImpl();
	 }
	 return edao;
 }
}
