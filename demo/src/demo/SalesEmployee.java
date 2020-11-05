package demo;

public class SalesEmployee {
private Integer sales;
private double commission;
private double netSalary;

public SalesEmployee() {
	sales=0;
	commission=0;
	netSalary=0;
}

public SalesEmployee(Integer sales,double commission, double netSalary) {
	this.sales=sales;
	this.commission=commission;
	this.netSalary=netSalary;
	
}

void calculatesalary(Integer sales,double commission,double netSalary){
	switch(sales) {
	case 1:if(sales<5000) {
		commission=netSalary*(2/100);
			}
	break;
	case 2:if(sales>=5000 && sales<10000) {
		commission=netSalary*(5/100);
		
	}
	break;
	case 3:if(sales>=10000&&sales<15000){
		commission=netSalary*(7/100);
		
	}
	break;
	case 4:if(sales>=15000) {
		commission=netSalary*(10/100);
		
	}
	default:System.out.println("nothing");
    break;
	
	}
	System.out.println(+(netSalary+commission));
	
	
}

@Override
public String toString() {
	return "SalesEmployee [sales=" + sales + ", commission=" + commission + ", netSalary=" + netSalary + "]";
}

}
