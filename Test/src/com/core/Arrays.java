package com.core;

public class Arrays {

	public static void main(String[] args) {

		int a[]= new int[5];
		
		int b[]= {1,4,5,6,8,10};  //Another way declaring an array
		for( int i=0;i<5;i++)
		{
			a[i]=i+1;       //Values of array = 1,2,3,4,5
		}

		for(int i: a)
		{
			System.out.println(i);
		}
		
		for(int j=0;j<=b.length-1;j++)
		{
			if((b[j]%2)!=0)
			{
				System.out.println(b[j]);
			}
		}
	}

}



