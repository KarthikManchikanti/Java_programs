package collectionandgenerics;

import java.util.Comparator;

public class ComparImpl implements Comparator<Integer>
{

	@Override
	public int compare(Integer arg0, Integer arg1) {
		
		if(arg0%10 > arg1%10)                 //It compares two integers and swaps the position
			return 1;  
		else
			return -1;
		
		                                      //If divided by 10 it gives the last digit
	}
	

}
