package com.test.proj.datamodel;

/**
 * Abstract class which stores the category name and a boolean method which defines whether the category is taxable or not.
 * @author sabina
 *
 */
public abstract class Category {
	private String categoryName;
	
	public Category(String name) {
		this.categoryName = name;
	}
	
	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public abstract boolean isTaxable();
	
}
