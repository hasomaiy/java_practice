package Week1;


abstract class CarService {
	
	abstract void prepareService();
	
	void runService() {
		System.out.println("Run Service...");
	}
	
	
	void service() {
		prepareService();
		runService();
	}
}


class CarAService extends CarService {
	void prepareService() {
		System.out.println("A Service");
	}
}

class carBService extends CarService {
	void prepareService() {
		System.out.println("B Service");
	}
}


public class Ex2 {
	
	public static void main(String[] args)
	{
		CarService car = new CarAService();
		car.service();
	}

}
