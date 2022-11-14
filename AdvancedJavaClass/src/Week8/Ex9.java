package Week8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> data = Arrays.asList("Adam","Bob","Carlo","Dave","Eve",
				"Francis","George","Halen","Ann","Chris","David","Danies","Joe"
				);
		
		
		data.stream().sorted().forEach(System.out::println);
		System.out.println("*****************************");
		
		
		data.stream().mapToInt(x -> x.length()).forEach(System.out::println);
		System.out.println("*****************************");
		
		data.stream().collect(Collectors.groupingBy(
				name -> name.charAt(0)
				)).forEach((ch,name) -> System.out.println(ch + " : " + name));
		
	}

}
