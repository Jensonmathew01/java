package java8;

public class Hotel {
	private int id;
	private int rent;
	private String name;
	public Hotel(int id, int rent, String name) {
		super();
		this.id = id;
		this.rent = rent;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", rent=" + rent + ", name=" + name + "]";
	}
	

}
