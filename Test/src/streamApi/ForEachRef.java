package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ForEachRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> val = new ArrayList<>();
		val.add(1);
		val.add(2);
		val.add(3);
		val.add(4);
		val.add(5);
		
	//	val.forEach(i ->DoubleIt(i));
	//val.forEach(ForEachRef::DoubleIt);  //for each method reference
		Stream<Integer> s= val.stream();
		s.forEach(System.out::println);
	//	s.forEach(System.out::println); //it gives an exception

	}
	
	public static void DoubleIt(int i)
	{
		System.out.println(i*2);
	}

}
