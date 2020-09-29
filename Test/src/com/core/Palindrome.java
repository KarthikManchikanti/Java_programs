package com.core;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
       
		int n,r,sum=0,temp;
		System.out.println("Enter a number");
		Scanner scan =new Scanner(System.in);
		n=scan.nextInt();
		scan.close();
		temp=n;
		while(n>0)
		{
			r=n%10;        //Remainder
			sum=(sum*10)+r;
			n=n/10;        //Gives quotient
		}
		n=temp;
		if(n==sum)
		{
			System.out.println("Its a palindrome");
		}
		else
		{
			System.out.println("Its not a palindrome");	
		}
		


		
	}

}
