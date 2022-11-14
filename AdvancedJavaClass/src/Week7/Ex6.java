package Week7;

import java.util.HashMap;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hmap = new HashMap<String,Integer>();
		
		hmap.put("New York City", 84000000);
		hmap.put("Houston", 22000000);
		hmap.put("Los Angeles", 39000000);
		hmap.put("Chicago", 27000000);
		hmap.put("Denver", 64000000);
		hmap.put("Kansas City", 46000000);
		
		hmap.forEach( (key,val) -> System.out.println("Key: "+key+" Value: "+ val) );
		
		
		
	}

}
