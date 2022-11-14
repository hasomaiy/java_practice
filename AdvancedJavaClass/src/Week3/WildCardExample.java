package Week3;

import java.util.Arrays;
import java.util.List;

public class WildCardExample {
	
	
	static int count(List<? extends Number> data) {
		int count=0;
		for (Number num:data)count++;
		return count;
	}

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(4,5,6,7);
		List<Double> list2 = Arrays.asList(1.1,2.2,5.5);
		
		System.out.println("List1 contains " + count(list1) + " elements");
		System.out.println("List2 contains " + count(list2) + " elements");
		
		
	}

}
