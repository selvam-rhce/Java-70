package co.edureka;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.domain.Employee;

public class Main {

	public static void main(String[] args) {
		//Initialize Spring Container
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		EmployeeDAO dao = (EmployeeDAO)context.getBean("empdao");
		
		/*
		//to save an employee
		Employee emp = new Employee(110,"Sachin",3500.5f);
		dao.saveEmp(emp);
		*/
		
		/*
		//to update an Employee
		Employee emp = new Employee(110,"Sachin Tendulkar",87500.5f);
		dao.updateEmp(emp);
		*/
		
		/*
		//to delete an Employee
		dao.deleteEmp(110);
		*/
		
		//to get all employees
		List<Employee> emps = dao.getEmployees();
		for(Employee emp : emps) {
			System.out.println(emp);
			try {
				Thread.sleep(2000);
			}catch(Exception ex) {}	
		}
	}
}
