package collectionandgenerics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterDemo {

	public static void main(String[] args) {

		Map<String, String> map =new HashMap<>();
		map.put("myname","Karthik");
		map.put("actor","Tom");
		map.put("ceo", "me");
		
		Set<String> keys= map.keySet();
		
		for(String key: keys)
		{
			System.out.println(key + " " +map.get(key));
		}
		
		

	}

}
