package com.karthik.springDemo;

public class Alien
{
	private int age;
	//private Laptop laptop;
	private Computer com;

	public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		this.com = com;
	}


/*	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	} */

	public Alien()
	{
		System.out.println("Alien Object created");
	}
	
	// using constructor to assign the values
	
	
	
	public int getAge() {
		return age;
	}

//	public Alien(int age) {
//		super();
//		this.age = age;
//	}

	public void setAge(int age) {
		System.out.println("Age value is assigned");
		this.age = age;
	}

	public void code()
	{
		System.out.println("I'm coding");
		com.compile();
	}
}
