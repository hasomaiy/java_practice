package InClassExLast;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InClass {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		
		Stream<String> lines =  Files.lines(
				Paths.get(args[0]).toAbsolutePath()
				);
		
		System.out.println(lines.flatMap(x -> Arrays.stream(x.split(" "))).distinct().count());
		
//		lines.map(x -> Arrays.stream(x)).forEach(System.out::println);
		
		System.out.println(lines.map(x -> x.split(" ")).count());

		

	}

}
