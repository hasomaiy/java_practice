package Week2;

// this is similar to class with some constant variables
enum Level{
	LOW,MEDIUM,HIGH;
	
	Level(){
		System.out.println("Constructor called for "+this .toString());
	}
	
}


public class EnumEx1 {

	public static void main(String[] args) {
		for (Level x : Level.values())
			System.out.println(x + " at index " + x.ordinal());
		
		
		Level val = Level.MEDIUM;
		
		switch(val) {
		case LOW:
			System.out.println("Its low");
			break;
		case MEDIUM:
			System.out.println("Its Medium ");
			break;
		case HIGH:
			System.out.println("Its High");
			break;
		}
		

	}

}
