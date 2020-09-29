package com.core;

public class FibonacciSeries {

	public static void main(String[] args) {

		
		int num1=0,num2=1, count=7;
		
		for(int i=0;i<count;i++)
		{
			System.out.println(num1);
			int sumOfPrevTwo=num1+num2;
			
			num1=num2;
			num2=sumOfPrevTwo;
		}
	}

}
