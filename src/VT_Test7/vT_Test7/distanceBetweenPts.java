package vT_Test7;


public class distanceBetweenPts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//3,17 and 18,10
		
		double y1 = 17;
		double y2 = 10;
		double x1 = 3;
		double x2 = 8;
		
		double AC = y2 - y1;
		double BC = x2 - x1;
		

		
//		double distance;
		
		double distance = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
		
		double distance2 = Math.sqrt((Math.pow(AC, 2)) + (Math.pow(BC, 2)));
		
//		double pow1 = Math.pow(x1, 2);
				
		System.out.println(distance);
		System.out.println(distance2);
//		System.out.println(pow1);
		
		System.out.println();
		System.out.println("VT HW");

		int a = 3;
		int b = 5;
		int c = 9;
		
		b = a;
		a = c;
		c = b;
		
		System.out.println(a + ", " + b + ", " + c);
		
		
	}

}
