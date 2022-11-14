package Week4;


//here data type is a variable T
class Item<T>{
	T[] data;
	
	  void set(T[] arrObjects) {
//		below will throw error
//		data = new T[input.length];
		
		data = (T[]) new Object[arrObjects.length];
		for (int i=0;i<arrObjects.length;i++)
				data[i] = arrObjects[i];
	}
	
	 Double sum(T[] data1) {
		 double ans = 0;
		for (int i=0;i<data1.length;i++)
			 ans += Double.parseDouble(data1[i].toString());
		 return ans;
			
	}
}




public class GenericApp {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArray = {1, 2, 3, 4, 5};
		Double[] doubleArray = {1.1, 1.2, 1.3, 1.4};
		// ADD your code here
		
		Item<Integer> data1 = new Item<Integer>();
		Item<Double> data2 = new Item<Double>();
		
//		data1.set(intArray);
//		data2.set(doubleArray);
		
		System.out.println(data1.sum(intArray));
		System.out.println(data2.sum(doubleArray));
		}
}