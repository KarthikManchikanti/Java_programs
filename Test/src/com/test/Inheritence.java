package com.test;

public class Inheritence {

	public static void main(String args[])
	{
		
		AddSubMul obj= new AddSubMul();
		obj.num1=5;
		obj.num2=5;
		obj.sum();
		System.out.println(obj.result);
		obj.sub();
		System.out.println(obj.result);
		obj.multi();
		System.out.println(obj.result);
		
		
	}
}                                          

class Add
{
	int num1,num2,result=0;
	
	public void sum()
	{
		result= num1+num2;
	}
}

class AddSub extends Add                              //Single inheritance
{
	public void sub()
	{
		result= num1-num2;
	}
	
}

class AddSubMul extends AddSub						//multilevel inheritance
{
	public void multi()
	{
		result= num1 * num2;
	}
}