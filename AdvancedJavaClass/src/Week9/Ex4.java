package Week9;

import java.util.stream.Stream;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] arr = new String[][] {
			{"a","b"},{"c","d"},{"e","f"}};
//		this is not in collection
//			also here it works in 1D even if array is 2D
			String[] ret= Stream.of(arr).flatMap(Stream::of).toArray(String[]::new);
			
			for (String s:ret)
				System.out.println(s);

	}

}
