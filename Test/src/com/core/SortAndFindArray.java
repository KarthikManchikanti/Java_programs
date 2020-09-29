package com.core;
import java.util.Arrays;

public class SortAndFindArray {

	public static void main(String[] args) {
		
		int a[]= {10,5,9,2,4,3,1};
		int target=5;
		Arrays.sort(a);
		for(int i:a)
		System.out.println("Sorted array: " +i);
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==target)
			{
				System.out.println("Element found at " +a[i]);
				break;
			}
			
		}
		
	}

}
