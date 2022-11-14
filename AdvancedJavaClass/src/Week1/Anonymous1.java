package Week1;


class MyClass{
	void print() {
		System.out.println("I am in outer class");
	}
	
	void doSomething() {
		System.out.println("Doing Something");
	}
	
	
}


class OtherClass{
	
	MyClass obj = new MyClass() {
		
		void print() {
			System.out.println("I am an anonymous class");
			
		}
		
		
};
}


public class Anonymous1 {

	public static void main(String[] args) {
		OtherClass x = new OtherClass();
		x.obj.print();
		x.obj.doSomething();

	}

}
