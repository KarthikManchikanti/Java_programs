package com.core;
import java.util.*;

public class SwappingNumbers {

	public static void main(String[] args) {

		int a,b,temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number a: ");
		System.out.println("Enter number b: ");
		
		a=scan.nextInt();

		System.out.println("Enter number a: " +a);

		b=scan.nextInt();
		scan.close();
		System.out.println("Enter number b: " +b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("a :"+a);
		System.out.println("b: "+b);

		
		
	}

}
