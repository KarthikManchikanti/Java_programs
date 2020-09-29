package com.core;

public class VarArgs {

	public static void main(String[] args) {

		Display obj =new Display();
		obj.show(5,6,7,8);
	}

}
class Display
{
	public void show(int... a)
	{
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		}
	}
}
