package Week1;

class Num{
	public static int classMember = 0;
	public int instanceMember = 0;
}

public class Test {
	
	void foo1() {
		System.out.println("foo1");
	}
	
	
	static void foo2() {
		System.out.println("foo2");
	}
	
	public static void main(String[] args)
	{
		Test t = new Test();
		t.foo1();
		t.foo2();
		
//		Since this is a static method , you can call by a class name ,note that you can also call by object
		Test.foo2();
		
		System.out.println(++Num.classMember);
//		below is error
//		System.out.println(++Num.instanceMember);
		
		Num x = new Num();
//		this increments instance variable
		System.out.println(++x.instanceMember);
//		this increments class variable as we can access class variable with object reference
//		this is not a good practice though
		System.out.println(++x.classMember);
		
		
		
		
	}

}
