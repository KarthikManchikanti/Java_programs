package com.test;

public class DemoException {

	public static void main(String args[])
	{
		int i,j,k=0;
		i=4;j=2;
		int arr[] = new int[4];
		try
		{
			//k=i/j;
			for(int c=0;c<=4;c++)
			{
				arr[c]=c +1;
			}
			for(int c:arr)
			{
				System.out.println(c);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide by zero "+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Maximum size is 4");
		} 
		System.out.println(k);
	}
}
