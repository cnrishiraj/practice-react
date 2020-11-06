package spring;

import java.util.ArrayList;

public class Employee {
	private Integer empId;
	private String name;
	private double salary;
	private Address address;
	private ArrayList<String> technologies;
	

	private ArrayList<Projects> projects;
	public Employee() {
		super();
	}
	public Employee(Integer empId, String name, double salary,Address address,ArrayList<String> technologies,ArrayList<Projects> projects) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.address=address;
		this.technologies=technologies;
		this.projects=projects;
	}
	public ArrayList<Projects> getProjects() {
		return projects;
	}
	public void setProjects(ArrayList<Projects> projects) {
		this.projects = projects;
	}
	public ArrayList<String> getTechnologies() {
		return technologies;
	}
	public void setTechnologies(ArrayList<String> technologies) {
		this.technologies = technologies;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", address=" + address
				+ ", technologies=" + technologies + ", projects=" + projects + "]";
	}
	
	
	
}