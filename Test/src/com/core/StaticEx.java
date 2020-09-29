package com.core;

public class StaticEx {

public static void main(String[] args) {
		
		Example.show();   //When we use static keyword we dont need to instantiate the class Abc
		Example.i=5;

	}

}

class Example
{
	static int i;
	public static void show()
	{
		System.out.println("Hi");
	}
}