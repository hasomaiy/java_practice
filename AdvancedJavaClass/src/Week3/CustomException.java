package Week3;

class MyCircle{
	
	double radius;
	
	MyCircle (double radius) throws InvalidRadiusException{
		setRadius(radius); 
	}
	
	
	void setRadius(double radius) throws InvalidRadiusException{
		if (radius>0) this.radius = radius;
		else throw new InvalidRadiusException(radius);
	}
	
}

class InvalidRadiusException extends Exception{
	double radius;
	InvalidRadiusException(double radius){
		super("Invalid Radius"+radius);
		this.radius = radius;
	}
}

public class CustomException {

	public static void main(String[] args) {
		try {
			new MyCircle(-5);
		}
		catch(InvalidRadiusException e)
		{
			System.out.println(e);
}
		finally
		{
			System.out.println("Continue to here");
		}
		
}
}
