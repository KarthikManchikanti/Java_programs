package streamApi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Java8Demo {

	public static void main(String[] args)
	{
		List<Integer> values= new ArrayList<>();
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		values.add(5);
		
		//External iterations
		
	/*	for(int i=0;i<5;i++)
		{
			System.out.println(values.get(i));
		}  */
		
	/*	Iterator<Integer> i = values.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}  */
		
/*		for(int i: values)
		{
			System.out.println(i);
		}  */
		
		//Internal iterations
		
		values.forEach(i->System.out.println(i));
		

}
}
