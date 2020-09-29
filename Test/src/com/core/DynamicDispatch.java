package com.core;

public class DynamicDispatch {

	public static void main(String[] args) {

		Abcd obj1 = new Abcd();
		Def obj2= new Def();
		Abcd a;
	}

}

class Abcd
{
	public void show()
	{
		System.out.println("In Abc");
	}
}

class Def extends Abcd
{
	public void show()
	{
		System.out.println("In Def");
	}
}