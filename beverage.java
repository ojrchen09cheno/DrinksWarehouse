package DrinkWarehouse;

public class beverage {
	
	//Beverage superclass attributes
	private int id;
	private double liters;
	private double price;
	private String brand;
	private int shelf;
	
	//Constructor
	public beverage(int id, double liters, double price, String brand, int shelf) {
		this.id = id;
		this.liters = liters;
		this.price = price;
		this.brand = brand;
		this.shelf = shelf;
	}
	
	//Setters, getters and print function
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getLiters() {
		return liters;
	}
	public void setLiters(double liters) {
		this.liters = liters;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getShelf() {
		return shelf;
	}
	public void print() {
		System.out.println("id: " + id);
		System.out.println("liters: " + liters);
		System.out.println("price: " + price);
		System.out.println("brand: " + brand);
		
	}

}
