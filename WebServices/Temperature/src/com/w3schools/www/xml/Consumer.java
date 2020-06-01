package com.w3schools.www.xml;

public class Consumer {
	public static void main(String[] args) throws Exception {
		TempConvertLocator locator = new TempConvertLocator(); 
		TempConvertSoap obj = locator.getTempConvertSoap();
		
		String cel = "104";
		String fah = obj.celsiusToFahrenheit(cel);
		System.out.println(cel+"C = "+ fah+"F");
	}
}
