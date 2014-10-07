package com.test.proj.datamodel;

/**
 * BookCategory extends abstract class Category and returns isTaxable as false
 * @author sabina
 *
 */
public class BookCategory extends Category{

	public BookCategory() {
		super("book");
	}

	@Override
	public boolean isTaxable() {
		return false;
	}

}
