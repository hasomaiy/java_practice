package Week8;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> data = new ArrayList<String>();
		
		data.add("AAAAAAAA");
		data.add("BBBBBB");
		data.add("CC");
		data.add("DDD");
		
		data.stream().filter(x -> x.length() < 6 ).forEach(System.out::println);
		
		
		long count = data.stream().filter(x -> x.length() < 6 ).count();
		
		System.out.println(count);
		

	}

}
