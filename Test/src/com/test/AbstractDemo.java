package com.test;

//Abstract classes and methods 

public class AbstractDemo {
	
	public static void main(String args[])
	{
		SureshPhone obj= new SureshPhone();      //abstract classes cannot have objects
									             //abstract classes cannot be instantiated
		obj.call();
		obj.cook();
		obj.move();
		obj.dance();
	}

}

abstract class Maheshphone                         //abstract class
{
	public void call()							//method defined
	{
		System.out.println("Caling...");
	}
	public abstract void move();				//abstract method declared
	public abstract void dance();
	public abstract void cook();
	
}

abstract class Rameshphone extends Maheshphone
{
	public void move()
	{
		System.out.println("Moving..");
	}
	public void dance()
	{
		System.out.println("Dancing..");
	}
	
	public abstract void cook();
}

class SureshPhone extends Rameshphone                    //concrete class
{
	public void cook()
	{
		System.out.println("Cooking..");
	}
}