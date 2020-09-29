package com.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryResource {

	public static void main(String[] args) throws Exception{
		
		int i=10;
		// TODO Auto-generated method stub
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
			String str= "";

			str=br.readLine();
		}

	}

}
