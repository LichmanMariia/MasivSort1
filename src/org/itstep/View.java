package org.itstep;

public class View {

	public static final String NotNumberInArray = "This number is not include array";
	public static final String NumberInArray = "This number is: ";
	public static final String IndexInArray = "Index number in array is: ";
	
	public void getMessageNotArray(String message) {	
		System.out.println(message);
	}
	
	public void getMessageInArray(String message, int number) {
		System.out.println(message + number);
	}
	
	public void getMessageInArrayIndex(String message, String index) {
		System.out.println(message + index);
	}
}