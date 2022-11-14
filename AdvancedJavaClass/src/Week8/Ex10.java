package Week8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] words = {"A","B","C","D","E","F"};
		
//		since this is not a collection we can not directly use stream
//		get is used just to remove optional
		System.out.println(
		Arrays.stream(words).reduce((w1,w2)  -> w1 + w2).get()
		);

//		this also serves same purpose as above
		System.out.println(
				Arrays.stream(words).collect(Collectors.joining())
				
				);
		
	}

}
