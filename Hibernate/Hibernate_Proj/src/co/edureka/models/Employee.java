package co.edureka.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee", schema = "java70")
public class Employee {
	private Integer empno;
	private String ename;
	private Float sal;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer empno, String ename, Float sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}
	@Id	
	@Column(name = "empno", unique = true, nullable = false, length = 5)
	public Integer getEmpno() {
		return empno;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	
	@Column(name="ename", length = 25)
	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	@Column(name="sal", length=10, precision = 2)
	public Float getSal() {
		return sal;
	}

	public void setSal(Float sal) {
		this.sal = sal;
	}

}
