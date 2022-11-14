package Week5;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<String> linkedSet = new LinkedHashSet<String>();
		linkedSet.add("Mary");
		linkedSet.add("Johnson");
		linkedSet.add("Peter");
		linkedSet.add("Sarah");
		linkedSet.add("Kate");
		
		
		Iterator<String> itr = linkedSet.iterator();
		
		while (itr.hasNext())
			System.out.println(itr.next());
		
		

	}

}
