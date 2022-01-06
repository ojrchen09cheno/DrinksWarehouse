package DrinkWarehouse;

public class soda extends beverage{
	
	//Soda child class has sugar percentage and discount attribute. Discount is 10%
	private int sugarPerc;
	private boolean discount;
	
	//Constructor
	public soda(int id, double liters, double price, String brand, int sugarPerc, boolean discount, int shelf) {
		super(id, liters, price, brand, shelf);
		this.sugarPerc = sugarPerc;
		this.discount = discount;
		if(discount)
			super.setPrice(price*0.9);
	}

	//Setters, getters and print function
	public int getSugarPerc() {
		return sugarPerc;
	}
	public void setSugarPerc(int sugarPerc) {
		this.sugarPerc = sugarPerc;
	}
	public boolean isDiscount() {
		return discount;
	}
	public void setDiscount(boolean discount) {
		this.discount = discount;
	}
	
	public void print() {
		System.out.println("Soda");
		super.print();
		System.out.println("Sugar %: " + sugarPerc);
		System.out.println("discount: " + discount);
	}

}
