package Week1;


// this is interface because it has no implementation of methods
interface carFullService{
	void runCarService();
}




class classAFullService implements carFullService{
	public void runCarService() {
		System.out.println("car A full service...");
	}
}


public class Ex3 {

	public static void main(String[] args)
	{
		carFullService car = new classAFullService();
		car.runCarService();
		
	}
}
