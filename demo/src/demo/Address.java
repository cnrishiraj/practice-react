package demo;

public class Address {
	private String city;
	private String state;
	private String laneno;
	private String houseno;
	
	
	public Address() {
		System.out.println("default constructor is called");
		city="";
		state="";
		laneno="";
		houseno="";
		
	}
	public Address(String city,String state,String laneno,String houseno) {
		System.out.println("parameterized constructor is called");
		this.city=city;
		this.state=state;
		this.laneno=laneno;
		this.houseno=houseno;
		
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getLaneno() {
		return laneno;
	}
	public void setLaneno(String laneno) {
		this.laneno = laneno;
	}
	public String getHouseno() {
		return houseno;
	}
	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", laneno=" + laneno + ", houseno=" + houseno + "]";
	}
	
}
