package Week7;

//below line restricts the number of methods to only one , we can not have more than one here
// but for traditional lambda expression you can have more that one

@FunctionalInterface
interface MyFunctionalInterface1{
//	public String sayHello();
	public String sayHello2();
}

public class Ex1 {

	public static void main(String[] args) {
		MyFunctionalInterface1 msg = () ->  "Hello World !!";
		
		System.out.println(msg.sayHello2());

	}

}
