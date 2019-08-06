package com.sreejesh;

import java.util.Objects;

import lombok.NonNull;

public class MainClassToTestNullChecks {

	public static void main(String[] args) {
		System.out.println("Entering Main!");
		
		String sampleString = "SampleString";
		//String sampleString = null;
		int lengthOfString = getLengthOfString(sampleString);
		System.out.println("lengthOfString: "+lengthOfString);
		nullCheckWithinAMethod();
		System.out.println("Exiting Main!");

	}
	
	private static int getLengthOfString(@NonNull String stringOne)
	{
		
		return stringOne.length();
	}

	private static void nullCheckWithinAMethod() {
		String stringTwo;
		stringTwo = null;
		//stringTwo = "SomeString";
		//Testing For stringTwo (local variable within a method)
		Objects.requireNonNull(stringTwo, "stringTwo cannot be null!");
		int stringTwoLength = stringTwo.length();
	}

}
