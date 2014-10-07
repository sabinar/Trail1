package com.test.proj.datamodel;

/**
 * FoodCategory extends abstract class Category and returns isTaxable as false
 * @author sabina
 *
 */
public class FoodCategory extends Category{

	public FoodCategory() {
		super("food");
	}

	@Override
	public boolean isTaxable() {
		return false;
	}

}
