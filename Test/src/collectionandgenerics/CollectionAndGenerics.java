package collectionandgenerics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//To print the values in collection we use iterator/ enhanced forloop

public class CollectionAndGenerics {

	public static void main(String[] args) throws Exception
	{

		Collection<Integer> values = new ArrayList<>();	
		values.add(5);
		values.add(3);
		values.add(22);
		values.remove(3);
	// Since we specified generics Integer it doesn't accept other data types	
	//	values.add(10.3);
	//	values.add("Karthik");
	//	values.add(77.2f); 
		
	/*	Iterator i = values.iterator();
		
		//System.out.println(i.next());
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}  */
		
		for(Object i:values)     //we use object it doesnt has a specified datatype
		{
			System.out.println(i);
		}
	}

}
