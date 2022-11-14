package Week7;

interface Executable {
	public void execute();
}

class Runner{
	void run(Executable e) {
		System.out.println("Running..");
		e.execute();
	}
}


public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner runner = new Runner();
//		runner.run(new Executable() {
//			public void execute() {
//				System.out.println("Hello World!!");
//			}
//			
////			note that this semicolon is outside the call of run method so its like just embedding the class + method while creating the object
//		});
		
		
//		this is the main usage of lambda expressions , since it simplifies usage of anonymous class that we used above
		
		
		runner.run(() -> System.out.println("Hello World!!") );
	}

}
