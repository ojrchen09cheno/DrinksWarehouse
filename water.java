package DrinkWarehouse;

public class water extends beverage{
	
	//Water child class has origin attribute
	private String origin;
	
	//constructor
	public water(int id, int liters, double price, String brand, String origin, int shelf) {
		super(id, liters, price, brand, shelf);
		this.origin = origin;
	}
	
	//Setters, getters and print function
	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	
	public void print() {
		System.out.println("Water");
		super.print();
		System.out.println("origin: " + origin);
	}

}
