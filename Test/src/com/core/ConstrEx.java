package com.core;

public class ConstrEx {

	public static void main(String[] args) {
		
		Abc obj= new Abc(5,5.5 );
	
	}

}

class Abc
{
	public Abc()              // Abc Constructor
	{
	  System.out.println("In Abc Constructor");
	}
	public Abc(int i)         // Abc Constructor overloading
	{
		System.out.println("Overloading constructor");
	}
	public Abc(int i, double d)
	{
		System.out.println("int double constructors");
	}
}
