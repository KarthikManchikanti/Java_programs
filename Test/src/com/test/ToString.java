package com.test;

public class ToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exto obj= new Exto("Karthik",57);
		System.out.println(obj);

	}

}

class Exto extends Object
{
	String name;
	int rollno;
	public Exto(String name, int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	
	@Override
	public String toString() 
	{
		return name+ " "+ rollno;
	} 
}

