
public class Employee extends Person {
	
	private int empId;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		System.out.println(super.toString());
		return "Employee [empId=" + empId + "]";
	}
	
	
	
}
