package Week8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> departments =  Arrays.asList(
				"Marketing" , "Mathematics" , "Chemistry" , "Mathematics" , "Physics",
				"Marketing" , "Physics" , "Marketing" , "Business" ,"Business"
				);

		Map<String,Long> ret = departments.stream().collect(Collectors.groupingBy(	
				deps -> deps,
				Collectors.counting()
				
				));
		
		ret.forEach((dept,count)  -> System.out.println(dept + " : "+ count));
		System.out.println("----------------------");
		
//		same as above two lines
		
		departments.stream().collect(Collectors.groupingBy(	
				deps -> deps,
				Collectors.counting()
				)).forEach((dept,count)  -> System.out.println(dept + " : "+ count));;
		
				System.out.println("----------------------");
		
//				to identify key of group by 
		departments.stream().collect(Collectors.groupingBy(	
				Function.identity(),
				Collectors.counting()
				)).forEach((dept,count)  -> System.out.println(dept + " : "+ count));;
				

		
		
	}

}
