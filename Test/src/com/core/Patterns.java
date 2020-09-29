package com.core;    
import java.util.Scanner;
    class Patterns{
    public static void main(String args[]){
      
      Scanner scan=new Scanner(System.in); 
    int size, i,j;//declare variables size,i,j;
      //create a scanner object for input
   // System.out.println("Enter a number");
   // size=scan.nextInt();
   
    scan.close();
    //get input from the user for size
    
    //Printing square
 /*   for(i=0;i<=size;i++)
    {
    	for(j=0;j<=size;j++)
    	{
    		System.out.print("*");
    	}
    	System.out.print("\n");
    }
   
    }
    } */

   /* for(i=1;i<=size;i++)
    {
    	for(j=1;j<=i;j++)
    	{
    		System.out.print(i);
    	}
    	System.out.print("\n");
    } */
    
  /*  for(i=5;i>=1;i--)
    {
    	for(j=5;j>=i;j--)
    	{
    		System.out.print(i);
    	}
    	System.out.print("\n");
    }
     */
    
    
    for(i=1;i<=4;i++)
    {
    	for(j=1;j<=4;j++)
    	{
    		if(i==1 || i==4 || j==1 || j==4)
    		{
    			System.out.print("*");
    		}
    		else
    		{
    			System.out.print(" ");
    		}
    	}
    	System.out.print("\n");
    }
   }
    
 }
    
    
    
   