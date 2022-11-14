package Week9;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Book{
	
	String title;
	HashSet<String> tags =new HashSet<String>();
	
	public Book(String title) {
		this.title = title;
	}
	
	Book addTag(String tag) {
		this.tags.add(tag);
		return this;
	}
	
	public Set<String> getTags() {
		return tags;
	}
	
}


public class Assign3 {
	
	 public static List<Book> getBooks() {
	 Book book1 = new Book("Java in Action")
	 .addTag("Java").addTag("Programming");
	 Book book2 = new Book("SQL in Action")
	 .addTag("SQL").addTag("Database").addTag("Programming");
	 Book book3 = new Book("Python in Action")
	 .addTag("Python").addTag("Programming");
	 Book book4 = new Book("Machine Learning in Action")
	 .addTag("Statistics");
	return Stream.of(book1, book2, book3, book4)
	 .collect(Collectors.toList());
	 }
	 
	 public static String getAllBookTitles(List<Book> books) {
	 // ADD YOUR CODE HERE	
	//	Should	be	just	one	statement
		 return books.stream().map(book -> book.title)
				 .reduce((x,y)  -> x + ", " + y  ).get();
											}
	 

	public static void main(String[] args) {
	 List<Book> books = getBooks();
	 books.forEach(book -> System.out.println(book.getTags()));
	 System.out.println();
	 System.out.println(getAllBookTitles(books));
	 System.out.println();
	 books.stream()
	.map(book -> book.getTags().contains("Programming"))
	.forEach(System.out::println);
									}
	}
