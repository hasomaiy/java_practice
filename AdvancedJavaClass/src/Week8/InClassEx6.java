package Week8;

import java.util.*;
public class InClassEx6 {
public static void main(String[] args) { List<Integer> data = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
// ADD YOUR CODE HERE

	data.forEach(

			x -> {
				
				if (x%2!=0)
					System.out.println(x);
				
			}
			
			
			
			);

}
}