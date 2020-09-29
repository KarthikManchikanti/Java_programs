package com.core;

import java.util.*;

public class DemoIf {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	/*	int num1;
		System.out.println("Enter number num1=");
		num1=scanner.nextInt();
		
		if(num1%2==0)
		{
			System.out.println("It is an even number");	
		}
		else
		{
			System.out.println("It is an odd number");
		} */
		
		
		int a, b,c;
		System.out.println("Enter number a");
		a=scanner.nextInt();
		System.out.println("Enter number b");
		b=scanner.nextInt();
		System.out.println("Enter number c");
		c=scanner.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("a is greater");
		}
		else if(b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
		
		

	}

}
