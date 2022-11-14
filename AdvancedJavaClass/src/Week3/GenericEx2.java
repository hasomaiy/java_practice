package Week3;

class Item2<T>{
	
	T[] data;
	
	void set(T[] input) {
//		below will throw error
//		data = new T[input.length];
		
		data = (T[]) new Object[input.length];
		for (int i=0;i<input.length;i++)
				data[i] = input[i];
	}
	
	void print() {
		for (T ele:data)
			System.out.print(ele + " ");
		System.out.println();
	}
}

public class GenericEx2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] intArray = {1,2,3};
		String[] stringArray = {"Hardik","Manish"};
		
		Item2<Integer> data1 = new Item2<Integer>();
		Item2<String> data2 = new Item2<String>();
		
		data1.set(intArray);
		data2.set(stringArray);
		
//		data1.get();
//		data2.get();

}
}