
public class RationalArray {

	public static void main(String[] args) {

		Rational[] numbers = new Rational[3];
		
		numbers[0] = new Rational();
		numbers[1] = new Rational(40, 12);
		numbers[2] = new Rational(1, 3);
		
		for (int index = 0; index < numbers.length; index++) {
		System.out.printf("NUMBER %d: %.2f %s\n", 	index,
													numbers[index].getValue(), 
													numbers[index].toString());

		}	
		//CAN ONLY HAVE ONE MAIN PROGRAM, CAN'T HAVE ONE MAIN PROGRAM CALL ANOTHER MAIN PROGRAM.
		
	}

}
