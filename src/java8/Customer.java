package java8;

public class Customer {
	private int registerid;
	private String name;
	private String phoneno;
	private String emailid;
	private String location;
	public Customer(int registerid, String name, String phoneno, String emailid, String location) {
		super();
		this.registerid = registerid;
		this.name = name;
		this.phoneno = phoneno;
		this.emailid = emailid;
		this.location = location;
	}
	public int getRegisterid() {
		return registerid;
	}
	public void setRegisterid(int registerid) {
		this.registerid = registerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Customer [registerid=" + registerid + ", name=" + name + ", phoneno=" + phoneno + ", emailid=" + emailid
				+ ", location=" + location + "]";
	}
	
}
	