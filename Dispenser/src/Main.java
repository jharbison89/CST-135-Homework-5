
public class Main {
	/* 
	 * Created by James Harbison and Chase Hausman
	 * This class tests the compareTo() method of both the Snack and Drink classes it 
	 * does this by directly using the compareTo() method for an array of Chips, a subclass of 
	 * Snack, then by invoking the java.util.Arrays.sort() method for that same array of Chips
	 * then also for an array of Drinks to ensure proper sorting 
	 */
	
	public static void main(String[] args) {
		
		// initialize an array of Chips using the overloaded arg constructor
		Chips[] chips = {new Chips("Lays Ridges", 1.99, 5, 5, "Original", "Kettle", 16), 
			new Chips("Ruffles", 1.99, 5, 5, "Original", "Kettle", 16),
			new Chips("Lays", 1.99, 5, 5, "Original", "Kettle", 16),
			new Chips("Lays Ridges", 2.99, 5, 5, "Original", "Kettle", 16)};
		
		System.out.println("before Inventory Management");
		for( int i = 0; i < chips.length; i ++) {
			System.out.println(chips[i].getCurrentQuantity() + "\t" + chips[i].getName());
		}
		System.out.println();
		
		InventoryManagement cart = new InventoryManagement();
		
		cart.selectItem(chips[1]);
		cart.selectItem(chips[3]);
		cart.selectItem(chips[3]);
		cart.selectItem(chips[2]);
		
		System.out.println(cart);
		
		
		cart.cancelItem(chips[1]);
		
		System.out.println(cart);
		
		System.out.println("after Inventory Management");
		for( int i = 0; i < chips.length; i ++) {
			System.out.println(chips[i].getCurrentQuantity() + "\t" + chips[i].getName());
		}		
		
		cart.emptyCart();
		
		System.out.println(cart);
		
		for( int i = 0; i < chips.length; i ++) {
			System.out.println(chips[i].getCurrentQuantity() + "\t" + chips[i].getName());
		}	
	}
}
