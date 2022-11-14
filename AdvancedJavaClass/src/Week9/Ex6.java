package Week9;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][][] numbers = {
				{
					{1,2,3},
					{4,5,6},
					{7,8,9,10}
		},
				{
			{1,2,3},
			{4,5,6},
			{7,8,9,10}
		},

	};
//		flattening multiple times to convert it from 3D to 1D
		System.out.println( "The total = " +
				Stream.of(numbers).flatMap(Arrays::stream)
					.flatMapToInt(x -> Arrays.stream(x)).sum());
							

}
}
