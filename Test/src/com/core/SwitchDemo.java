package com.core;
import java.util.*;

//Write a Java program to detect key presses. 

public class SwitchDemo {

	public static void main(String[] args) {
		

		detectkey();

		
	}
	
	static void detectkey()
	{
		Scanner scanner = new Scanner(System.in);
		char key=' ';
		System.out.println("Enter a number key");
		key=(char)scanner.nextInt();
		scanner.close();
		switch(key)
		{
			case 0: System.out.println("You have pressed 0");
			 break;
			case 1: System.out.println("You have pressed 1");
	         break;
			case 2: System.out.println("You have pressed 2");
	         break;
			case 3: System.out.println("You have pressed 3");
	         break;
			case 4: System.out.println("You have pressed 4");
	         break;
			case 5: System.out.println("You have pressed 5");
	         break;
			default:System.out.println("Entered invalid key");
	         
			         
			         
			
		}
		
		
		
	}

}
