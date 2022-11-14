package Week1;

public class Point {
	
		int x, y;
		
		Point(int x, int y)
		{
			this.x = x;
			this.y = y;
		}
		
		@Override
		public String toString() {
			return "(x,y)=(" + x + " , " + y + ")";
		}
		
		@Override
		public boolean  equals(Object obj) {
			Point p = (Point) obj;
			return x == p.x && y==p.y;
		}

		public static void main(String[] args)
		{
			Point pt1 = new Point(5,6);
			Point pt2 = new Point(4,6);
			Point pt3 = new Point(5,6);
			
			System.out.println(pt1);
			System.out.println(pt2);
			System.out.println(pt3);
			
//			this compares the addresses , we need to override to make them compare values instead
			if (pt1.equals(pt3))
				System.out.println("Objects are equal");
			else
				System.out.println("Objects are not equal");
			
			
			
		}
	
}
