package com.sreejesh;

import java.util.Objects;

import com.scottshipp.code.mill.NullSafe;

import lombok.Data;
import lombok.NonNull;

public class MainClassToTestNullChecks {

	public static void main(String[] args) {
		System.out.println("Entering Main!");
		
		String sampleString = "SampleString";
		//String sampleString = null;
		int lengthOfString = getLengthOfString(sampleString);
		System.out.println("lengthOfString: "+lengthOfString);
		testNestedNullChecksInObjects();
		//nullCheckWithinAMethod();
		System.out.println("Exiting Main!");

	}
	
	private static int getLengthOfString(@NonNull String stringOne)
	{
		
		return stringOne.length();
	}
	
	private static void testNestedNullChecksInObjects()
	{
		Child childOne = new Child();
		childOne.setChildValue(100);
		Parent parentOne = new Parent();
		parentOne.setChild(childOne);
		
		Integer childOneValue = NullSafe.of(parentOne)
						                .call(Parent::getChild)
						                .call(Child::getChildValue)
						                .get();
	    System.out.println("childOneValue: "+childOneValue);
	    
	    Parent parentWithNullChild = new Parent();
		parentOne.setChild(null);
		Integer childTwoValue = NullSafe.of(parentWithNullChild)
						                .call(Parent::getChild)
						                .call(Child::getChildValue)
						                .get();
		System.out.println("childTwoValue: "+childTwoValue);
		
	}

	private static void nullCheckWithinAMethod() {
		String stringTwo;
		stringTwo = null;
		//stringTwo = "SomeString";
		//Testing For stringTwo (local variable within a method)
		Objects.requireNonNull(stringTwo, "stringTwo cannot be null!");
		Integer stringTwoLength = stringTwo.length();
		System.out.println("stringTwoLength: "+stringTwoLength);
	}
	
	
	@Data
	static class Parent
	{
		Child child;
	}
	
	@Data
	static class Child
	{
		Integer childValue;
	}

}
