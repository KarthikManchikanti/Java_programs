package com.core;
import java.util.*;

public class PerfectNumber {

	public static void main(String[] args) {
	
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check if it is perfect or not");
		n=scan.nextInt();
		scan.close();
		boolean b= isPerfect(n);
		{
			if(b)
				System.out.println("It is a perfect number");
			else
				System.out.println("Not a perfect number");
		}
		

	}
	
	public static boolean isPerfect(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
			if(n==sum)
			{
				return true;
			}
		}
	
		return false;
	}

}
