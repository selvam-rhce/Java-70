package co.edureka.jdbc;

import java.util.List;

public interface EmployeeDAO {
 public void saveEmp(Employee emp) throws Exception;
 public void updateEmp(Employee emp) throws Exception;
 public void deleteEmp(int eno) throws Exception;
 public Employee searchEmp(int eno) throws Exception;
 public List<Employee> getEmployees() throws Exception;
}
