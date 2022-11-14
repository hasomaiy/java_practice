package Week7;

import java.util.stream.Stream;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream.of("Hello","World","Today").forEach( x -> System.out.println(x));
		
		System.out.println("======================");
		
//		if the order is not important to you and you want to improve the performance then use parallel
//		since it processes data in parallel , this is main diff between stream and collections 
//		since  collections always work in some sequence in the context of processing I am saying
		Stream.of("Hello","World","Today").parallel().forEach( x -> System.out.println(x));
			
	}

}
