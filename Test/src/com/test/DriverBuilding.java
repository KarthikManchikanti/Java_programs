package com.test;

import java.util.ArrayList;

public class DriverBuilding {

	public static void main(String[] args) {

		Buildings b= new Buildings("abc","montreal",5);
		ArrayList<Buildings> b1= new ArrayList<Buildings>();
		b1.add(b);
		Concrete a = new Concrete(b1);
		
	}

}
