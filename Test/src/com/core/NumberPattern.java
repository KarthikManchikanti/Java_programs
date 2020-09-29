package com.core;

public class NumberPattern {

	public static void main(String[] args) {

		int i,j;
	
		/*
		 1 2 3 4
		 2 3 4 1
		 3 4 1 2
		 4 1 2 3
		*/
		
	/*	for(i=1;i<=4;i++)
		{
			for(j=1;j<=4;j++)
			{
				int k=i+j-1;
				if(k>4)
				{
					System.out.print(k-4);
				}
				else
				{
					System.out.print(k);

					
				}
				
			} 
			System.out.print("\n");
			
			
				
				
		} */
		
		/*1
		 *0 1
		 *1 0 1
		 *0 1 0 1
		 *1 0 1 0 1	 */
		
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				if((i+j)%2==0)
				System.out.print("0");
				else
					System.out.print("1");
			}
			System.out.print("\n");
		}
	}

}
