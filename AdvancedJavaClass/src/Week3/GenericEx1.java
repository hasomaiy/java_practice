package Week3;

// here data type is a variable T
class Item<T>{
	T data;
	
	void set(T x) {this.data = x;}
	T get() {return this.data;}
}

public class GenericEx1 {
	
	
	static <VAR> void Print(VAR[] data) {
		for (VAR ele:data)
			System.out.print(ele + " ");
		System.out.println();
	}
	
	static <T1,T2> void Add(T1[] data1,T2[] data2) {
		for (int i=0;i<data1.length;i++) {
			double ans = Double.parseDouble(data1[i].toString()) + 
						Double.parseDouble(data2[i].toString());
			System.out.print(ans + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] intArray = {1,2,3};
		Double[] doubleArray = {1.1,2.2,3.3};
		String[] stringArray = {"Hardik","Manish"};
		
		Print(intArray);
		Print(doubleArray);
		Print(stringArray);
		
		Add(intArray,doubleArray);
		
		Item<Integer> data1 = new Item<Integer>();
		Item<String> data2 = new Item<String>();
		
		data1.set(intArray[0]);
		data2.set(stringArray[0]);
		
		System.out.println();
		System.out.println("Data1 " + data1.get());
		System.out.println("Data2 " + data2.get());

	}

}
