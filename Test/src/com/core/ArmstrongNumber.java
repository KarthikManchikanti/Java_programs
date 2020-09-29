package com.core;
import java.util.*;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		scan.close();
		int temp,sum=0,i;
		temp=n;
		while(n>0)
		{
			i=n%10;
			sum=sum+(i*i*i);
			n=n/10;
		}
		n=temp;
		if(n==sum)
		{
			System.out.println("It is an Armstrong number");
		}
		else
		{
			System.out.println("Not an arm strong number");
		}
		
		

	}

}
