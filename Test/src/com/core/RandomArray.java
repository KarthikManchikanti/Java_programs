package com.core;

import java.util.Random;

public class RandomArray {

	public static void main(String[] args) {

		int a[]= new int[10];
		Random r = new Random();
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=r.nextInt(50);   //Generates all random variables <50
		}
		try {
			System.out.println("Max size of array is 9");
		}
		catch(Exception e)
		{
			System.out.print(a[12]);
		}
		//If I didnt use exception the program would crash 
		// and displays ArrayIndexOutOfBoundException
		for(int i : a)
		{
			System.out.println(i); //Prints all the random variables
		}
	}

}
