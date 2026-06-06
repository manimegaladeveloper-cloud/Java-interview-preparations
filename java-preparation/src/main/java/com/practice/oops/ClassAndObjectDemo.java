package com.practice.oops;

public class ClassAndObjectDemo {
	
	String name;
	
	public static void main(String args[]) {
		
		
		ClassAndObjectDemo obj = new ClassAndObjectDemo();
		
		obj.name ="Car";
		
        ClassAndObjectDemo obj1 = new ClassAndObjectDemo();
		
		obj1.name ="Pogo";
		
		System.out.println("Data 1: "+ obj.name);
		System.out.println("Data 2: "+ obj1.name);

		
	}

}
