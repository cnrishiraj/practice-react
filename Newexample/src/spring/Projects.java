package spring;

public class Projects { 
	private String proId;
	private String proName;
	private String proClient;
	public Projects(String proId, String proName, String proClient) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.proClient = proClient;
	}
	public String getProId() {
		return proId;
	}
	public void setProId(String proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public String getProClient() {
		return proClient;
	}
	public void setProClient(String proClient) {
		this.proClient = proClient;
	}
	@Override
	public String toString() {
		return "Projects [proId=" + proId + ", proName=" + proName + ", proClient=" + proClient + "]";
	}
	
	

}