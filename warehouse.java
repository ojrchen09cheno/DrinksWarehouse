package DrinkWarehouse;
import java.util.HashMap;
import java.util.Map;

public class warehouse {
	
	//Attributes for warehouse class. Store beverages in a Map using the beverage Id
	private Map<Integer ,beverage> storage = new HashMap<Integer, beverage>();
	//Don't pay a lot of attention to shelf and shelfsize attributes as these are more practical in real life
	private int shelf;
	private int shelfSize;
	
	//Constructor
	public warehouse(int shelf) {
		this.shelf = shelf;
	}
	
	//Price of whole warehouse looping through each key in the map
	public double totalPrice() {
		double total = 0;
		for(Map.Entry<Integer, beverage> set : storage.entrySet()) {
			total += set.getValue().getPrice();
		}
		return total;
	}
	
	//Price of a specific brand, looping through the map and check for brand name
	public double brandPrice(String brand) {
		double total = 0;
		for(Map.Entry<Integer, beverage> set : storage.entrySet()) {
			if(set.getValue().getBrand().equals(brand))
				total += set.getValue().getPrice();
		}
		return total;
	}
	
	//Price of a specific shelf, looping through the map and checking for shelf number
	public double shelfPrice(int shelf) {
		//Check if shelf exists
		if(shelf > this.shelf || shelf <= 0) {
			System.out.println("Shelf does not exist");
			return 0;
		}
		double total = 0;
		for(Map.Entry<Integer, beverage> set : storage.entrySet()) {
			if(set.getValue().getShelf()==shelf)
				total += set.getValue().getPrice();
		}
		return total;
	}
	
	//Overload adding beverage functions for water and soda
	public void addBeverage(int id, int liters, double price, String brand, String origin, int shelf) {
		water temp = new water(id, liters, price, brand, origin, shelf);
		if(storage.containsKey(id)) {
			System.out.println("ID alredy exists");
		}
		else
			storage.put(id, temp);
	}
	
	public void addBeverage(int id, int liters, double price, String brand, int sugar, boolean discount,int shelf) {
		if(storage.containsKey(id)) {
			System.out.println("ID" + id + " alredy exists");
		}
		else {
			soda temp = new soda(id, liters, price, brand, sugar, discount,shelf);
			storage.put(id, temp);
		}
		
	}
	
	//Delete beverage function by id
	public void deleteBeverage(int id) {
		if(storage.containsKey(id)) {
			storage.remove(id);
			System.out.println("Id " + id + " deleted");
		}
		else
			System.out.println("ID " + id + " not found");
	}
	
	//Print current beverages in the warehouse
	public void printWarehouse() {
		for(Map.Entry<Integer,beverage> set : storage.entrySet()) {
			set.getValue().print();
		}
	}

}
