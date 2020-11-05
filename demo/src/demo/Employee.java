package demo;

public class Employee {
	private Integer empId;
	private String name;
	private double salary;
	private Address address;
	private SalesEmployee salesemployee;
	
	public Employee() {
		System.out.println("default constructor is called");
		empId=0;
		name="";
		salary=0;
		address=new Address();
		salesemployee=new SalesEmployee();
	}
	
	public Employee(Integer empId,String name,double salary,Address address,SalesEmployee salesemployee) {
		System.out.println("Parameterized constructor is called");
		this.empId=empId;
		this.name=name;
		this.salary=salary;
		this.address=address;
		this.salesemployee=salesemployee;
	}

	public SalesEmployee getSalesemployee() {
		return salesemployee;
	}

	public void setSalesemployee(SalesEmployee salesemployee) {
		this.salesemployee = salesemployee;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", address=" + address
				+ ", salesemployee=" + salesemployee + "]";
	}

	
	
	
	
}
