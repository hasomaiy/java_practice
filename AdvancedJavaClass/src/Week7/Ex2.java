package Week7;

interface MyFunctionalInterface2{
	public int incrementByFive(int a);
}

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		here we are passing the parameter , also note that we dont need to specify the type of num
//		since there is only one method its gonaa use that to match the type of parameter passed as well as return type
		MyFunctionalInterface2 f= (num) -> num+5 ;
		
		System.out.println(f.incrementByFive(10));

	}

}
