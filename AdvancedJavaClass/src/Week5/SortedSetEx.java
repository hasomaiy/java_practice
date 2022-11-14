package Week5;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetEx {

	public static void main(String[] args) {
		
		SortedSet<String> sset = new TreeSet<String>();
		
		sset.add("C");
		sset.add("B");
		sset.add("A");
		sset.add("D");
//		No duplicates since its a set
		sset.add("A");
		sset.add("E");
		
		
		System.out.println(sset);
		
		
		
		sset.remove("A");

		System.out.println(sset);
		
		
		Iterator<String> itr = sset.iterator();
		
		while (itr.hasNext())
			System.out.println(itr.next());
		
		
		System.out.println("------Head Set-----");
//		head set gets all the elements before D
		SortedSet<String> headSet = sset.headSet("D");
		System.out.println(headSet);
		
//		all elements after D including D
		System.out.println("-------Tail Set-------");
		SortedSet<String> tailSet = sset.tailSet("D");
		System.out.println(tailSet);
		
		System.out.println("-------Sub Set-------");
//		all the elements between first and second parameters , first inclusive and second exclusive
		SortedSet<String> subSet = sset.subSet("A","P");
		System.out.println(subSet);
		
		
		
		
		
		
	}

}
