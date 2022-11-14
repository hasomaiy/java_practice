package Week3;

class Item3<T>{
	T data;
	
	void set(T x) {this.data = x;}
	T get() {return this.data;}
}

public class GenericEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stringArray = {"Hardik","Manish"};
		
		
//		below is not the right way to allocate memory for generic
//		Item3<String>[] data = new Item3<String>[3];
		
//		this is correct
		Item3<String>[] data = (Item3<String>[]) new Item3[3];
		for (int i =0;i<stringArray.length;i++)
		{
			data[i] = new Item3<String>();
			data[i].set(stringArray[i]);
		}
		
		
		for (int i =0;i<stringArray.length;i++)
		{
			System.out.println(data[i].get());
		}
		

	}

}
