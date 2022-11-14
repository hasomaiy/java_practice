package Week5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {

		HashMap<String,Integer> hmap = new HashMap<String,Integer>();

		hmap.put("New York City", 84000000);
		hmap.put("Houston", 22000000);
		hmap.put("Los Angeles", 39000000);
		hmap.put("Chicago", 27000000);
		hmap.put("Denver", 84000000);
		hmap.put("Kansas City", 46000000);
		
		
		if (hmap.containsKey("Kansas City"))
			System.out.println("Population of Kansas City is " + hmap.get("Kansas City"));
		
//		Iterator expects only one parameter , so map entry takes key and value and puts them into one box
		Iterator< Map.Entry<String, Integer>> itr = hmap.entrySet().iterator();
		
		while (itr.hasNext()) {
			Map.Entry<String, Integer> m = itr.next();
			System.out.println("Key = " + m.getKey() + "  value = " + m.getValue());
		}
	}

}
