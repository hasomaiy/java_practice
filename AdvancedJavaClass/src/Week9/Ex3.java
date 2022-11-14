//package Week9;
//
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.Comparator;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//
//class Data1{
//	String MovieName,StudioName,Rating;
//	Long Earnings;
//	Integer TheatreCount;
//	
//	public String getMovieName() {
//		return MovieName;
//	}
//	public void setMovieName(String movieName) {
//		MovieName = movieName;
//	}
//	public String getStudioName() {
//		return StudioName;
//	}
//	public void setStudioName(String studioName) {
//		StudioName = studioName;
//	}
//	public String getRating() {
//		return Rating;
//	}
//	public void setRating(String rating) {
//		Rating = rating;
//	}
//	public Integer getTheatreCount() {
//		return TheatreCount;
//	}
//	public void setTheatreCount(Integer theatreCount) {
//		TheatreCount = TheatreCount;
//	}
//	public Long getEarnings() {
//		return Earnings;
//	}
//	public void setEarnings(Long earnings) {
//		Earnings = earnings;
//	}
//	
//	
//}
//
//public class Ex3 {
//
//	public static void main(String[] args) throws Exception {
//		// TODO Auto-generated method stub
//		
//		Stream<String> lines =  Files.lines(
//				Paths.get(args[0]).toAbsolutePath()
//				).skip(1);
//		
////		lines is already a stream
//		List<Data> movies = lines.map(str -> {return extracted(str);})
//								 .collect(Collectors.toList());
//
//		System.out.println("Total number of movies = " + movies.size());
//		
//		System.out.println("2. Total number of theaters for Sony: " + 
//				movies.stream().map(data->data.getTheatreCount())
//					.filter(data->data.equals("Sony"))
//					.count()
//				 );
//	
//		Comparator<Data> comp = new Comparator<Data>() {
//			@Override
//			public int compare(Data a, Data b)
//			{
//				return Integer.valueOf(b.getTheatreCount())-Integer.valueOf(a.getTheatreCount());
//			}
//		};
//		
//		System.out.println("3. The top 10 number of theaters in descending order: ");
//		movies.stream().sorted(comp).limit(10).forEach(data->System.out.println("Movie Name: "+ data.getMovieName()+ " \nNumber of Theater: " + data.getNoOfTheaters()));
//			
//		System.out.println("4. The rating counts for PG-13, R, G, and PG: ");
//		movies.stream().map(data->data.getRating()).filter(data->!data.equals("N/A"))
//				.collect(Collectors.groupingBy(a-> a, 
//						Collectors.counting()))
//				.forEach((key,value)->System.out.println(key+" \t"+value));
//		
//		System.out.println("5. The average earning for PG-13, R, G, and PG: ");
//		movies.stream().filter(data->!data.getRating().equals("N/A"))
//						.collect(Collectors.groupingBy( data->data.getRating()))
//						.forEach((a,b)->
//						{		
//							
//							 System.out.println("Rated: "+a+" \tAverage Earning : "+ 
//							 b.stream().map(data->Long.parseLong(data.getEarnings())).reduce((x,y)->x+y).get()/b.size());
//							
//						});
//
//		
////		set is used to do the counting since it will maintain unique elements
//		System.out.println("Rating Counts = " + 
//		movies.stream().map(movie -> movie.getRating())
////						.filter(x -> x.contains("N/A"))
//						.collect(Collectors.toSet())
//						.size());
//		
//		movies.stream().collect(Collectors.groupingBy(
//					Data::getRating , 
//					Collectors.counting()
//				)).forEach((k,v) -> System.out.println( k + "=" + v));
//	}
//
//	private static Data extracted(String str) {
//		String[] strings = str.split(",");
//		Data data = new Data();
////			putting data from stream to my data class
//		data.setMovieName(strings[1]);
//		data.setStudioName(strings[2]);
//		data.setRating(strings[7]);
//		return data;
//	}
//	
//}
//
