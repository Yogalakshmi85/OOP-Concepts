package foodApp;

import java.util.ArrayList;
import java.util.HashMap;

public class Restaurant {
	String name="Twiggy";
    HashMap<String, FoodItems> menuHashMap=new HashMap<String, FoodItems>();
	private int chargeLimit=300;
	private int chargeAmt=50;
	
	public Restaurant() {
		menuHashMap.put("A001", new FoodItems("A001", "Fried Rice", 220));
		menuHashMap.put("A002", new FoodItems("A002", "Chicken Rice", 200));
		menuHashMap.put("A003", new FoodItems("A003", "Sambar Rice", 120));
		menuHashMap.put("A004", new FoodItems("A004", "Curd Rice", 80));
	}
	
	private StringBuilder orderedItems=new StringBuilder();	
	public int calculateTotal(ArrayList<String> foodItem) {
		int tot=0;
		
		for(String itemCode: foodItem) {
			if(CheckAvailability(itemCode)) {
				FoodItems items=menuHashMap.get(itemCode);
				tot+=items.getPrice();
				orderedItems.append("\n").append(items.getItemName());
			}
			else {
				System.out.println("Item Id : "+itemCode+" is not available");
			}
		}	
		if(tot==0) return 0;
		if(tot<chargeLimit) {
			tot+=chargeAmt;
		}
		return tot;	
	}	
	public boolean CheckAvailability(String item) {
		return menuHashMap.containsKey(item);
		
	}
	public String getOrderedItems() {
        return orderedItems.toString().isEmpty() ? "No valid items ordered" : orderedItems.toString();
    }
}
