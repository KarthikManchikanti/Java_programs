package streamApi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args)
	{
		List<Integer> values= new ArrayList<>();
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		values.add(5);
		
		//Internal iterations
		
	/*	Consumer<Integer> c = new Consumer<Integer>()  //Implementing consumer interface with anonymous class
				{
					public void accept(Integer i)
					{
						System.out.println(i);
					}
				}; */
		
	//	Consumer<Integer> c = (Integer i)->System.out.println(i);  //Lambda expression
		
	//	Consumer<Integer> c = i->System.out.println(i);
		
	values.forEach(i->System.out.println(i));		//for each method ref
		
	//	values.forEach(System.out::println);
				
	//	values.forEach(i->System.out.println(i));
		

}
}
