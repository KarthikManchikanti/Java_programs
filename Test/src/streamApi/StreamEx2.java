package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamEx2 {

	public static void main(String[] args) {

		List<Integer> values= Arrays.asList(1,2,3,4,5);
		
/*		Function<Integer,Integer> f = new Function<Integer,Integer>()
				{
					public Integer apply(Integer i)
					{
						return i*2;
					}
				};
				
		BinaryOperator<Integer> b = new BinaryOperator<Integer>()
				{
					public Integer apply(Integer i, Integer j)
					{
						return i+j;
					}
				};
				
				Stream s =  values.stream();
				
				Stream s1 = s.map(f);
								//2,4,6,8,10
				
				Integer result= (Integer)s1.reduce(0,b);
				
				System.out.println(result);   */    //The output of above is same as below
				
			//	System.out.println(values.stream().map(i->i*2).reduce(0,(c,e)->c+e));
		
/*		Stream s =  values.stream();
		
		Stream s1 = s.map(new Function<Integer,Integer>()
		{
			public Integer apply(Integer i)
			{
				return i*2;
			}
		});
						//2,4,6,8,10
		
		Integer result= (Integer)s1.reduce(0,new BinaryOperator<Integer>()
		{
			public Integer apply(Integer i, Integer j)
			{
				return i+j;
			}
		});
		
		System.out.println(result);         */
	//	System.out.println(values.stream().map(i->i*2).reduce(0,(c,e)->Integer.sum(c, e)));
		System.out.println(values.stream().map(i->i*2).reduce(0,Integer::sum));

		
	}

}
