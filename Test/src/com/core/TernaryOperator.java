package com.core;

public class TernaryOperator {

	public static void main(String[] args) {

		Object obj1, obj2;
		if(true)
		{
			obj1= new Integer(10);
		}
		else
		{
			obj1= new Double(15.0);
		}
		
		System.out.println(obj1);
		
		obj2= true? new Integer(10) : new Double(15.0); // It takes the value of the highest type
		System.out.println(obj2);
		
	}

}
