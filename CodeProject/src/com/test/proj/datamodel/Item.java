package com.test.proj.datamodel;

/**
 * Data object Item item related information like itemName, price, item source and category of the item
 * @author sabina
 *
 */
public class Item {
	private String itemName;
	private double price;
	private ItemSource itemSource;
	private Category category;
	
	public Item(String name, double price, ItemSource source, Category cat) {
		this.itemName = name;
		this.price = price;
		this.itemSource = source;
		this.category = cat;
	}
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public ItemSource getItemSource() {
		return itemSource;
	}
	public void setItemSource(ItemSource itemSource) {
		this.itemSource = itemSource;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
}
