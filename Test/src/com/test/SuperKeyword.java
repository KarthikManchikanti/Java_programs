package com.test;

public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bcd obj= new Bcd();
		obj.show();


	}

}

class Abcd
{

	public void abc()
	{
		System.out.println("Abcd in A"); 
	}
}

class Bcd extends Abcd
{
	int i=5;        //It will override the value of 10
	public void show()
	{
		super.abc();
		System.out.println("Bcd in B");
	//System.out.println(super.i);    //If we use super keyword it will call value of i i.e parent class
	}
}