package Week2;

public class IndexOutOfBoundEx {

	public static void main(String[] args) {
		
		try {
		
		int[] data = {1,2,3};
		
		for (int i=0; i<=3; i++)
			System.out.println(data[i]);

	}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}
		
		System.out.println("Continue to here");

}
}
