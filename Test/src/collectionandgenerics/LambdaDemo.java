package collectionandgenerics;


interface A
{
	void show();          //by default it is public
}

/*class xyz implements A
{
	public void show()
	{
		System.out.println("Hello");
	}
} */

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj;          
/*		obj= new A()
				{
			     public void show()
			     {
			    	 System.out.println("Hello");    
			     }
				};  */
		obj=() ->
		{
			System.out.println("Hello");
		}; 
		obj.show();

	}

}
