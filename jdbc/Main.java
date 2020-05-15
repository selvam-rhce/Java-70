package co.edureka.jdbc;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		EmployeeDAO dao = EmployeeDAOFactory.getEmployeeDAO();

		/*
		 * //1. to insert a new Employee System.out.println("enter empno, name, sal");
		 * int eno = sc.nextInt(); 
		 * String name = sc.next(); 
		 * float sal = sc.nextFloat();
		 * Employee emp = new Employee(eno,name,sal); 
		 * dao.saveEmp(emp);
		 */

		/*
		 * //2. to Update an Employee Employee emp = new
		 * Employee(101,"Sunil Joseph",50000); dao.updateEmp(emp);
		 */

		/*
		 * //3. delete an Employee
		 * System.out.print("enter employee number to delete: "); 
		 * int eno = sc.nextInt(); 
		 * dao.deleteEmp(eno);
		 */
		
		/*
		// 4. Searching an Employee
		System.out.print("enter employee number: ");
		int eno = sc.nextInt();
		Employee e = dao.searchEmp(eno);
		if(e != null)
			System.out.println(e);
		else
			System.out.println("No matching employee found!");
		*/
		
		//5. get all employees
		List<Employee> emps = dao.getEmployees();
		for(Employee emp : emps) {
			System.out.println(emp);
			Thread.sleep(1500);
		}
		sc.close();
	}

}
