package java8;

public class product {
	private String pname;
	private String ID;
	private int price;
	public product(String pname, String iD, int price) {
		super();
		this.pname = pname;
		ID = iD;
		this.price = price;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
