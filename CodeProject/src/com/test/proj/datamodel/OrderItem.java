package com.test.proj.datamodel;

import com.test.proj.helper.Helper;

/**
 * Creates an orderItem along with quantity of the Item required. Whenever an Item is created, we calculate the tax basic on the basic tax and import duty
 * Basic sales tax of 10% is applicable for all items except items which fall under the category book, food and medicines. 
 * Additional import duty of 5% is applied for imported items.
 * @author sabina
 *
 */
public class OrderItem {
	Item item;
	int quantity;
	double tax;
	
	public OrderItem(Item item, int quantity) {
		this.item = item;
		this.quantity = quantity;
		setTax();
	}
	
	// Calculates tax on item based on item source and category
	public void setTax() {
		double calcTax = 0.0;
		if (item.getCategory().isTaxable()) {
			if (item.getItemSource().equals(ItemSource.importSource))
				calcTax = Helper.BASIC_SALES_TAX + Helper.IMPORT_DUTY;
			else 
				calcTax = Helper.BASIC_SALES_TAX;
		}
		else {
			if (item.getItemSource().equals(ItemSource.importSource))
				calcTax = Helper.IMPORT_DUTY;		
		}
		
		tax = calcTax * item.getPrice();
		System.out.println("Tax value: " + tax);
	}
	
	public double getTax() {
		return tax;
	}
	
	// Returns tax on the item
	public double getItemTax() {
		return (getTax() * quantity);
	}
	
	// Returns total value of item after tax
	public double getItemValue() {
		return (getTax() + item.getPrice())*quantity;
	}
	
	public Item getItem() {
		return item;
	}
}
