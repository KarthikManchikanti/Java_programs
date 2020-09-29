package com.core;

public class TwoDArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {1,2,3,4};
		int c[]= {1,2,3,4};
		int d[][]= {
				   {1,2,3,4},
				   {1,2,3,4},
				   {1,2,3,4}
				};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(d[i][j] +" ");
			}
			System.out.println("");
		}

		

	}

}
