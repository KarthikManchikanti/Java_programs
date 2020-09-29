package com.core;
import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {

		int n;
		System.out.println("Enter a number");
		Scanner scan= new Scanner(System.in);
		n=scan.nextInt();
		scan.close();
		
		boolean b=true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				b=false;
				break;
			}
		
		}
		if(b)
		{
			System.out.println("It is a prime");
		}
		else
			System.out.println("Not a prime");
	}

}
