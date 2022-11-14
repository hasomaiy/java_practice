package Week5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Person implements Comparable<Person>{
	String name;
	int age;
	
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
//	Note that O is capital
	@Override
	public String toString() {
		return "Name: " + name + " Age: " + age + "\n";
	}
	
//	this is abstract method of class comparable which must be implemented since your are implementing the interface
	@Override
	public int compareTo(Person p) {
		int nameCmp = this.name.compareTo(p.name);
		int ageCmp = this.age > p.age ? 1 : -1;
		
		return (nameCmp==0) ? ageCmp:nameCmp;
	}
	
	
}



public class SortEx {

	public static void main(String[] args) {
		ArrayList<Person> data= new ArrayList<Person>();
		
		data.add(new Person("John",27));
		data.add(new Person("Sarah",37));
		data.add(new Person("Sarah",24));
		data.add(new Person("Peter",22));
		data.add(new Person("Ajay",29));
		data.add(new Person("Susan",22));

		
//		System.out.println(data);
		
//		Just to show that this is also the part of collections framework
		Iterator<Person> itr = data.iterator();
		
		while (itr.hasNext())
			System.out.println(itr.next());
		
		Collections.sort(data);
		
		System.out.println("============================");
		for (Person p:data)
			System.out.println(p);
		
	}

}
