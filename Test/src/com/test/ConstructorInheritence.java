package com.test;

public class ConstructorInheritence {

	public static void main(String[] args) {

		B obj = new B(5);
	}

}

class C
{
	public C()
	{
		System.out.println("In constructor A");
	}
	public C(int i)
	{
		System.out.println("In A constructor int");
	}
}

class B extends C
{
	public B()
	{
		System.out.println("In constructor B");
	}
	public B(int i)
	{
		System.out.println("In B constructor int");
	}	
}
