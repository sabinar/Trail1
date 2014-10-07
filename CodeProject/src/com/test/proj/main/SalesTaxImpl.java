package com.test.proj.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.test.proj.datamodel.BookCategory;
import com.test.proj.datamodel.Category;
import com.test.proj.datamodel.FoodCategory;
import com.test.proj.datamodel.Item;
import com.test.proj.datamodel.ItemSource;
import com.test.proj.datamodel.MedicineCategory;
import com.test.proj.datamodel.Order;
import com.test.proj.datamodel.OrderItem;
import com.test.proj.datamodel.OtherCategory;

/**
 * Class SalesTaxImpl is the main class that allows user to input data.
 * Assumptions: The user needs to input the following fields
 * a) Item name
 * b) Price
 * c) Whether the item is imported or not
 * d) Whether the item is of any of the category a)book b)medicine c)food d)others
 * e) Quantity
 * @author sabina
 *
 */
public class SalesTaxImpl {
	
	public static void main(String[] args) {
		
		String itemImport;
				
		Scanner input = new Scanner(System.in);
		try{
			System.out.println("Enter no. of items:");
			int num = input.nextInt();
			
			Order order = new Order();
			
			for (int i = 0; i < num; i++) {
				// Skip the newline
				input.nextLine();
				
				System.out.println("Enter Item name:");
				String itemName = input.nextLine();
				
				System.out.println("Enter price:");
				double itemPrice = input.nextFloat();
				
				// Loop till y or n is entered
				while(true) {
					System.out.println("Is item imported (y/n):");
					itemImport = input.next();
					if ((itemImport.equals("y") || itemImport.equals("n")))
						break;
					else
						System.out.println("Didn't understand input. Please enter y/n");
				}
				
				System.out.println("Enter category (b:book, f:food, m:medicine, o:other): ");
				String categoryStr = input.next();
				
				System.out.println("Enter quantity: ");
				int quantity = input.nextInt();
				
				Category category;
				switch (categoryStr.charAt(0)) {
					case 'b' : category = new BookCategory(); break;
					case 'f' : category = new FoodCategory(); break;
					case 'm' : category = new MedicineCategory(); break;
					default : category = new OtherCategory(); break;
				}
					
				Item item = new Item(itemName, 
									itemPrice, 
									(itemImport.equals("y") ? ItemSource.importSource : ItemSource.domestic), 
									category);
				
				// Adding item to OrderList
				OrderItem oi = new OrderItem(item, quantity);
				order.addOrderItem(oi);
			}
			
			//displaying list
			order.displayOrderList();
			
		}
		catch (InputMismatchException e) {
			// If there is any mismatch of data, error message is thrown and the user needs to start again
			System.out.println("Input entered is of incorrect type. Please try again!!!");
		}
	}
	
}
