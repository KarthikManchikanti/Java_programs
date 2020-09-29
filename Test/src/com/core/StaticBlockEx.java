package com.core;

public class StaticBlockEx {
	
	static String s="";
	static
	{
		s="Hello world";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The value of s is: " +s);

	}

}
