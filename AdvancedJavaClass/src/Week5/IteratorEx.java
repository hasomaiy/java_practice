package Week5;

import java.util.Iterator;

class Data<T> implements Iterable<T>{
	
	T[] data;
	int size;
	int numElements=0;
	int idx=0;
	int currIndex = 0;
	
	Data(int size){
		this.size = size;
		this.data = (T[]) new Object[size];
	}
	
	void add(T element) {
		if (numElements<size) {
			data[idx++] = element;
			numElements++;
		}
	}
	
	
//	this is anonymous class
	public Iterator<T> iterator(){
//		must include hasNext , next and remove
		
		Iterator<T> itr = new Iterator<T>() {
			
			public T next() {
				return data[currIndex++];
			}
			
			public boolean hasNext() {
				return currIndex<numElements ? true:false;
			}
			
			public void remove() {}
			
	};
	
		return itr;
	
}
}
public class IteratorEx {

	public static void main(String[] args) {
		
		int n = 5;
		
		Data<Integer> num = new Data<Integer>(n);
		
		for (int i =0;i<n;i++)
			num.add(i);
		
		Iterator<Integer> itr = num.iterator();
		
		while (itr.hasNext())
			System.out.println(itr.next());
	}
}
