package com.sreejesh;

import org.apache.commons.lang3.StringUtils;

public class MainClassToTestStringUtils {

	public static void main(String[] args) {
		System.out.println("Entering Main!");
		
		String nullString = null;
		boolean nullStringIsEmpty = StringUtils.isEmpty(nullString);
		System.out.println("nullStringIsEmpty: "+nullStringIsEmpty);
		
		String emptyString = "";
		boolean emptyStringIsEmpty = StringUtils.isEmpty(emptyString);
		System.out.println("emptyStringIsEmpty: "+emptyStringIsEmpty);
		
		String spaceString = " ";
		boolean spaceStringIsEmpty = StringUtils.isEmpty(spaceString);
		System.out.println("spaceStringIsEmpty: "+spaceStringIsEmpty);
		
		
		boolean spaceStringIsBlank = StringUtils.isBlank(spaceString);
		System.out.println("spaceStringIsBlank: "+spaceStringIsBlank);
		
		System.out.println("Exiting Main!");

	}
	
	
}
