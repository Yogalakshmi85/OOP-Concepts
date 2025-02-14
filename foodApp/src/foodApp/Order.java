package foodApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {
	public static void main(String[] args) {
		ArrayList<String> foodItem=new ArrayList<String>();
		Scanner scanner=new Scanner(System.in);
		String food = "";
		System.out.println("Enter the item codes to get the bill");
		while (true) {
            food = scanner.nextLine();
            if (food.equalsIgnoreCase("Done")) break; 
            foodItem.add(food);
        }
		Restaurant restaurant=new Restaurant();
		
		int total_Amt=restaurant.calculateTotal(foodItem);
		
		System.out.println(restaurant.name);
		System.out.println();
		System.out.println("You Ordered: "+ restaurant.getOrderedItems());
		System.out.println();
		System.out.print("Total bill: "+total_Amt);
		scanner.close();
	}
}
