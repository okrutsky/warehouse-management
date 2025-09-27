package wms;
import java.util.HashMap;
import java.util.Map;

/*
 * InventoryService is responsible for managing stock levels of items. It allows adding stock, removing stock for order fullfillment, 
 * and checking current stock.
 */

public class InventoryService {
	
	private Map<String, Integer> stock;
	
	public InventoryService() {
		this.stock = new HashMap<>();
	}
	
	// Adding stock
	public void addStock(Item item, int quantity) {
		stock.put(item.getId(), stock.getOrDefault(item.getId(), 0) + quantity);
		System.out.println(quantity + " units of " + item.getName() + " added.");
		
	}
	
	// Remove stock - for order fullfilment
	public boolean removeStock(Item item, int quantity) {
		int currentQty = stock.getOrDefault(item.getId(), 0);
		if (currentQty >= quantity) {
			stock.put(item.getId(), currentQty - quantity);
			System.out.println(quantity + " units of" + item.getName() + " removed.");
			return true;
		} else {
			System.out.println("Not enough stock for " + item.getName());
			return false;
		}
	}
	
	public int checkStock(Item item) {
		return stock.getOrDefault(item.getId(), 0); 
	}
}

