package Week9;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data1 = {1,2,3,4,5};
		int[] data2 = {10,9,8,7,6};
//		sir says x is int array , using array method you convert it into collection so that it can be streamed
//		peek method below helps to understand that
		System.out.println( "The total = " +
		Stream.of(data1,data2)
		.flatMapToInt(x -> Arrays.stream(x))
		.peek(System.out::println)
		.sum());

	}

}
