package com.test;

//interface example


interface Abc
{
	 void show();
}

class AbcImplements implements Abc

{
	public void show()
	{
		System.out.println("In Showwwww");
	}
	
	public void display()
	{
		System.out.println("In Displayyy");	
	}
}

public class InterfaceEx {
	
	public static void main(String args[])
	{
		//Abc obj= new Abc();  // It doesnt work because interface cannot create objects
		
		//Abc obj =new AbcImplements();
		//obj.show();
		//obj.display();    //It doesnt work because interface is using the memory of class AbcImplements and cannot access display method
		
		AbcImplements obj = new AbcImplements();
		obj.display();
		obj.show();
		
	}

}
