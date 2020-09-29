package com.core;

public class PostPreIncre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=5;
		int j =i++;             //Post increment
		System.out.println(j);  //  o/p=5
		// Its because the value is first assigned and the incremented so value of j=5
		System.out.println("j="+j+ " "+"i="+i);  //So the value of i=6 and j=5
		
		int a=5;
		int b= ++a;            //pre increment
		System.out.println(b);   //  o/p=6
		//Its because the value is incremented first and then it is assigned
		
		int x=4;
		
		int temp;
		temp=x;
		x++;
		x=temp; //here the value of x=5
		
		x=x++;
		System.out.println(x);  //Here the value is assigned and then incremented its like
		
		
 		

	}

}
