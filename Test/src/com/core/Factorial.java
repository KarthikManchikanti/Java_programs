package com.core;

import java.util.*;
public class Factorial {

	public static void main(String[] args) {


		int number;
		System.out.println("Enter the factorial of a number");
		Scanner scanner = new Scanner(System.in);
		number=scanner.nextInt();
		scanner.close();
		int fact=1;
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;

		}
		System.out.println("Factorial of a number is " + fact);
	}

}
