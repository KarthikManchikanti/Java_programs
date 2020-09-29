package com.core;

public class ObjectPassing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Paper p =new Paper();
		p.setText("Hello world");
		System.out.println(p.getText());
		
		
		Printer hp = new Printer();
		hp.print(p);
		System.out.println(p.getText());   

	}

}
class Printer
{
	public void print(Paper p)
	{
		p.setText("Get lost");
	}
}
class Paper
{
	String text;
	public void setText(String t)
	{
		text=t;
	}
	public String getText()
	{
		return text;
	}
}
