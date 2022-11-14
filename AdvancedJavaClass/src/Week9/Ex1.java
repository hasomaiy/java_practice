package Week9;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> hmap = new HashMap<String,Integer>();
		
		hmap.put("New York City", 84000000);
		hmap.put("Houston", 22000000);
		hmap.put("Los Angeles", 39000000);
		hmap.put("Chicago", 27000000);
		hmap.put("Denver", 64000000);
		hmap.put("Kansas City", 50000000);
		
		hmap.forEach( (key,val) -> System.out.println("Key: "+key+" Value: "+ val) );
		
		Map<String,Integer> ret =new LinkedHashMap<String,Integer>();
		
		hmap.entrySet().stream()
			.sorted(Map.Entry.<String,Integer> comparingByValue().reversed())
			.forEach(x -> ret.put(x.getKey(),x.getValue()));
		
		System.out.println(ret);
		
		

	}

}
