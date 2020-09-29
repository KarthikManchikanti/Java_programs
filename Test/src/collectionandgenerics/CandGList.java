package collectionandgenerics;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

//To print the values in collection we use iterator/ enhanced forloop

public class CandGList {

	public static void main(String[] args) throws Exception
	{

		List<Integer> values = new ArrayList<>();	
	//	values.add(5);
	//	values.add(3);
	//	values.add(22);
		values.add(305);
		values.add(998);
		values.add(774);
		values.add(236);
		values.add(881);
		values.add(329);
		
		Comparator<Integer> com = new ComparImpl();
		
		Collections.sort(values, com);	
		
		
		//values.remove(3);
		
		//values.add(1,10);
//		Collections.sort(values);    //The method sort takes only list not collection interface
	
	
		
		for(int i:values)    
		{
			System.out.println(i);
		}
	}

}
