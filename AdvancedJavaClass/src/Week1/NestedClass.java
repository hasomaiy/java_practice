package Week1;



class OuterClass {
	private int x = 99;
	
	void print() {
		System.out.println("x=" + x);
		
		InnerClass obj =  new InnerClass();
		obj.y = 100;
		System.out.println("y=" + obj.y);
		
	}
	
	class InnerClass {
		
		private int y = 1;
		
		void print() {
			System.out.println("x=" + x);
		}
		
		
		
	}
	
}


public class NestedClass {

	public static void main(String[] args) {
		
		OuterClass outerClassObj = new OuterClass();
		OuterClass.InnerClass innerClassObj = outerClassObj.new InnerClass();
		
		
		outerClassObj.print();
		innerClassObj.print();
		
	}

}
