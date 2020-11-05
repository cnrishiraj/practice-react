package demo;

public class MyWorld  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee a = new Employee();
		System.out.println(a);
		
		Employee a1=new Employee(101,"rishi",98888,new Address("hyd","hy","77","307/1"),new SalesEmployee(10000,50000,500));
		System.out.print(a1);
		SalesEmployee a2=new SalesEmployee();
		a2.calculatesalary(18888,10,100);
		
		}
		
	}
	

