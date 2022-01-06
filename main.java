package DrinkWarehouse;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		//Create warehouse with 2 shelves
		warehouse test = new warehouse(2);
		
		//Adding beverages and printing
		test.addBeverage(1,  1,  1, "Oasis", "Oasis",1);
		test.addBeverage(2,  2,  2, "Pepsi", 10, false,1);
		test.addBeverage(3,  3,  3, "Manantial", "Manantial",2);
		test.addBeverage(4,  4,  10, "Coke", 10, true,2);
		test.printWarehouse();
		System.out.println();
		
		//Testing functions
		System.out.println("Total price at the moment should be 15 " + test.totalPrice());
		
		//Delete once, and check for delete non-key
		test.deleteBeverage(4);
		test.deleteBeverage(4);
		
		//Add beverage with an used key
		test.addBeverage(1, 0, 0, "shouldntwork", "error",1);
		
		//Testing prices by brand and shelf
		test.addBeverage(5, 5, 20, "Pepsi", 10, true,2);
		System.out.println("Brand price should be 20: " + test.brandPrice("Pepsi"));
		System.out.println("Shelf price should be 21: " + test.shelfPrice(2));

	}

}
