package com.test;

interface A
{
	static void show()
	{
		System.out.println("Showwwww");
	}
}

public class InterfaceStatic {

	public static void main(String[] args) {
		
		A.show();                         // If we use static method in an interface there is no need to create an object
	}

}
