package co.edureka;

import java.util.List;

import co.edureka.domain.Employee;

public interface EmployeeDAO {
 void saveEmp(Employee emp);
 void updateEmp(Employee emp);
 void deleteEmp(int eno);
 List<Employee> getEmployees();
}
