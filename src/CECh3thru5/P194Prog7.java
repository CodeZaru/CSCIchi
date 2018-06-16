
public class P194Prog7 {

	public static void main(String[] args) {
		
		System.out.print("Enter a number of drinks: ");
		int number = new java.util.Scanner(System.in).nextInt();

		int weight = 150;
		double ouncesAlcohol = 0.55;
		double BAC = (4.136 * number * ouncesAlcohol)/weight;
		
if (BAC >= 0.08)
	System.out.println("Call safe ride--whatever you do, DON'T DRIVE");
	else if ((BAC >= 0.05) && (BAC < 0.08))
		System.out.println("Still, don't drive");
	else System.out.println("U R OK to Drive!");


	}

}
