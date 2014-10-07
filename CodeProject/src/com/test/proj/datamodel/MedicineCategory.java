package com.test.proj.datamodel;

/**
 * MedicineCategory extends abstract class Category and returns isTaxable as false
 * @author sabina
 *
 */
public class MedicineCategory extends Category{

	public MedicineCategory() {
		super("medicine");
	}
	
	@Override
	public boolean isTaxable() {
		return false;
	}

}
