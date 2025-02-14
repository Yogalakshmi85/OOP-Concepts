package foodApp;

public class FoodItems {
	private String itemId;
	private String itemName;
	private int price;
	
	public FoodItems(String itemId, String itemName, int price) {
		this.itemId=itemId;
		this.itemName=itemName;
		this.price=price;
	}
	
	public String getItemId() { return itemId; }
	
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemName() { return itemName; }
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getPrice() { return price; }
	
	public void setPrice(int price) {
		this.price = price;
	}
	
}
