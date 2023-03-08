package java8;

public class Food extends Student {
	private String fname;
	private int price;
	public Food(String fname, int price) {
		super(price, fname);
		this.fname = fname;
		this.price = price;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Food [fname=" + fname + ", price=" + price + "]";
	}
	

}
