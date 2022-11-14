package Week4;
class MyStack<T>
{
	T[] data;
	int size = 10;
	int idx = 0;
	
	
	MyStack(){
		data = (T[]) new Object [size];
	}
	
	
	 void push(T item) {
		if (idx>= size) {
			System.out.println("Stack overflow");
			return;
		}
		else {
			data[idx++] = item;
		}
	}
	
	
	T pop() {
		if (idx==0) {
			System.out.println("Stack is empty");
			return null;
		}
		else {
			return data[--idx];
		}
	}
	
	
}


public class StackEx {

	public static void main(String[] args) {
		
		MyStack<Integer> intStack = new MyStack<Integer>();
		MyStack<Double> doubleStack = new MyStack<Double>();

//		intStack.push(1);
//		intStack.push(2);
//		
//		System.out.println(intStack.pop());
//		
		doubleStack.push(1.1);
		doubleStack.push(2.2);
		
		System.out.println(doubleStack.pop());
		
		

	}

}
