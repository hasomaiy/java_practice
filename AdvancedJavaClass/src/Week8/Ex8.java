package Week8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> data =  new ArrayList<Integer>();
		
		data.add(1);
		data.add(2);
		data.add(3);
		data.add(4);

		data.stream().map(x -> x*x).forEach(System.out::println);
		
		System.out.println("*****************************");
		
//		0 is the initial value
//		0 + 1*1 + 2*2 + 3*3 + 4*4
		System.out.println(
		data.stream().map(x -> x*x)
					.reduce(0,  (x,y)  -> x+y)
	
		);
		
		System.out.println("*****************************");
		
//		1 * (1*1) * (2*2) * (3*3) * (4*4)
		System.out.println(
				data.stream().map(x -> x*x)
							.reduce(1,  (x,y)  -> x*y)
			
				);
		
	}

}
