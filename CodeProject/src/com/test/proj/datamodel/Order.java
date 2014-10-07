package com.test.proj.datamodel;

import java.util.ArrayList;
import java.util.List;

import com.test.proj.helper.Helper;

/**
 * Order.java creates a list of OrderItems and saves into arraylist.
 * Also has variables for totalSalesTax an totalOrderPrice which is updated whenever an OrderItem is added.
 * A similar approach can also be done for delete.
 * @author sabina
 *
 */
public class Order {
	private List<OrderItem> orderItemList;
	private double totalSalesTax;
	private double totalOrderPrice;
	
	
	public Order() {
		orderItemList = new ArrayList<OrderItem>();
		totalSalesTax = 0.0;
		totalOrderPrice = 0.0;
	}
	
	public double getTotalSalesTax() {
		return totalSalesTax;
	}
	
	public double getTotalOrderPrice() {
		return totalOrderPrice;
	}
	
	public void addOrderItem(OrderItem oi) {
		orderItemList.add(oi); 
		//adding itemSalesTax of Item to totalSalesTax and itemValue of Item to totalOrderPrice
		
		totalSalesTax += Double.parseDouble(Helper.getRoundValue(oi.getItemTax())); //totalSalesTax += oi.getItemTax();
		totalOrderPrice += Double.parseDouble(Helper.getRoundValue(oi.getItemValue()));
		
		System.out.println("\n" + oi.item.getItemName() + " has been added!!\n");
	}
	
	// Method to display one item
	public void displayOrderItem(OrderItem oi) {
		System.out.println(oi.quantity + " " + (oi.getItem().getItemSource().equals(ItemSource.importSource) ? "imported of " : "" ) 
				+ oi.getItem().getItemName() + ": " + Helper.getRoundValue(oi.getItemValue()));
	}
	
	// Method to display all items along with sales tax and total
	public void displayOrderList() {
		for (OrderItem oi : orderItemList) {
			displayOrderItem(oi);
		}
		System.out.println("Sales Tax: " + Helper.getRoundValue(getTotalSalesTax()));
		System.out.println("Total: " + Helper.getRound2Decimal(getTotalOrderPrice()));
	}
	
	//To do
	public void deleteOrderItem(OrderItem oi){}
}
