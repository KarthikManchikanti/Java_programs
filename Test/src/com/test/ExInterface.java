package com.test;

public class ExInterface extends Ai implements I,J{

	public static void main(String[] args) {

		Ai obj= new Ai();	
		obj.show();
	}

}

interface I
{
	default void show()
	{
		System.out.println("I");
	}
}

interface J
{
	default void show()
	{
		System.out.println("J");
	}
}
class Ai
{
	public void show()
	{
		System.out.println("A");
	}
}
