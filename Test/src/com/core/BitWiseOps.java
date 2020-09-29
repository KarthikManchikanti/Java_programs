package com.core;

public class BitWiseOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Bit Wise and Operator
		int a=25; // 1 1 0 0 1
		int b=15; // 0 1 1 1 1
		          // 0 1 0 0 1 ->9
		
		int c= a & b;
		System.out.println(c);
		
		// Bit wise or Operator
		
		int d=25; // 1 1 0 0 1
		int e=15; // 0 1 1 1 1
		          // 1 1 1 1 1 ->31
		
		
		int f= e | d;
		System.out.println(f);
		

	}

}
