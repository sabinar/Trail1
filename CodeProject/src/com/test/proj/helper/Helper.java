package com.test.proj.helper;

import java.text.DecimalFormat;

/**
 * Helper class that has method to round double values upto 2 decimal digits
 * @author sabina
 *
 */
public class Helper {
	
	// default constants for sales tax and import duty
	public static final double BASIC_SALES_TAX = 0.10;
	public static final double IMPORT_DUTY = 0.05;
	
	
	//Helper method to round values
	public static String getRoundValue(double value) {
		double nearestValue = Math.ceil(value/0.05f) * 0.05f;
		//In case the second digit after the decimal is less than 5, then round to nearest 0.05 decimal else display as is
		int digit = (int)(value*100 - (int)(value*10)*10);
		if (digit < 5)
			return (getRound2Decimal(nearestValue));
		else
			return (getRound2Decimal(value));
	}
	
	// Method to round to two decimal places
	public static String getRound2Decimal(double value) {
		DecimalFormat df = new DecimalFormat("###,##0.00");
		return df.format(value);
	}
}
