package com.core;

public class PrintingAsciiValues {
	
	public static void main(String args[])
	{
		int i;
		for(i=0;i<=127;i++)
		{
			System.out.printf("%d : %c \n", i,i);
		}
	}

}
