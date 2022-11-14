package Week9;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

class Data{
	private String name,Theater,earning,rated,NoOfTheaters;
	
	public String getNoOfTheaters() {
		return NoOfTheaters;
	}

	public void setNoOfTheaters(String noOfTheaters) {
		NoOfTheaters = noOfTheaters;
	}

	//getter and setters 
	public String getTheater() {
		return Theater;
	}

	public void setTheater(String theater) {
		Theater = theater;
	}

	public String getEarning() {
		return earning;
	}

	public void setEarning(String earning) {
		this.earning = earning;
	}

	public String getRated() {
		return rated;
	}

	public void setRated(String rated) {
		this.rated = rated;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class Assign4 {

	public static void main(String[] args) throws Exception {
		
		
		Stream<String> lines = Files.lines( Paths.get((args[0])).toAbsolutePath()).skip(1);
		
		
		List<Data> movies = lines.map(str->{
			return extracted(str);
		}).collect(Collectors.toList());
		
		
		System.out.println("1. Total Number Of Movies: " + movies.size() );
		System.out.println("*******************************************************");

		System.out.println("2. Total number of theaters for Sony: " + 
				movies.stream().filter(data->data.getTheater().equals("Sony"))
							   .map(data -> Long.parseLong(data.getNoOfTheaters()))
							   .reduce((x,y) -> x+y).get()
				 );
		System.out.println("*******************************************************");
		
		Comparator<Data> comp = new Comparator<Data>() {
			@Override
			public int compare(Data a, Data b)
			{
				int theatreCompare = Integer.valueOf(b.getNoOfTheaters())>Integer.valueOf(a.getNoOfTheaters())?1:-1;
				return theatreCompare;
			}
		};
		
		System.out.println("3. The top 10 number of theaters in descending order: ");
		movies.stream().sorted(comp).limit(10).forEach(data->System.out.println("Movie: "+ data.getName()+ " Number of Theatres: " + data.getNoOfTheaters()));
		System.out.println("*******************************************************");
			
		System.out.println("4. The rating counts excluding N/A ");
		movies.stream().filter(data->!data.getRated().equals("N/A")).collect(Collectors.groupingBy(
				Data::getRated , 
				Collectors.counting()
			)).forEach((k,v) -> System.out.println( k + "=" + v));
		System.out.println("*******************************************************");
		
		System.out.println("5. The average earning ratings excluding N/A ");
		movies.stream().filter(data->!data.getRated().equals("N/A"))
						.collect(Collectors.groupingBy( data->data.getRated()))
						.forEach((a,b)->
						{		
							
							 System.out.println("Rating: "+a+" \tAverage Earning in Millions : "+ 
							 b.stream().map(data->Long.parseLong(data.getEarning())).reduce((x,y)->x+y).get()/b.size());
							
						});
							
	}

	private static Data extracted(String str) {
		String[] strings = str.split(",");
		Data data = new Data();
		data.setName(strings[1]);
		data.setTheater(strings[2]);
		data.setEarning(strings[3]);
		data.setRated(strings[7]);
		data.setNoOfTheaters(strings[4]);
		
		return data;
	}

}


