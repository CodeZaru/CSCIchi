public class Temperature2Array {
	public static void main(String [] args) {
		double [] Temperature2 = new double[7];
		double total = 0;
		
		Temperature2[0] = 80.0;
		Temperature2[1] = 81.0;
		Temperature2[2] = 78;
		Temperature2[3] = 76;
		Temperature2[4] = 79;
		Temperature2[5] = 80;
		Temperature2[6] = 99;

		for (int index = 0; index < Temperature2.length; index++) {
			total += Temperature2[index];
		}
		
		System.out.println("Average Temperature2 is " + total / Temperature2.length);
	}
}