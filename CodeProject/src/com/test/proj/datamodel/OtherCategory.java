package com.test.proj.datamodel;

/**
 * OtherCategory extends abstract class Category and returns isTaxable as true
 * @author sabina
 *
 */
public class OtherCategory extends Category{

	public OtherCategory() {
		super("other");
	}

	@Override
	public boolean isTaxable() {
		return true;
	}

}
