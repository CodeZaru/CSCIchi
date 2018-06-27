
public class RationalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rational r1 = new Rational();
		Rational r2 = new Rational(40,12);
		Rational r3 = new Rational(3,9);
		
		//default numerator and denominatro are 0 and 0..hardcoded to return zero
		System.out.printf("R1: %.2f %s\n",r1.getValue(), r1.toString());
		System.out.printf("R2: %.2f %s\n",r2.getValue(), r2.toString());	
		System.out.printf("R3: %.2f %s\n",r3.getValue(), r3.toString());	
		//printf commands: d integer s string c character f for double so .2 means decimal and 2
		
		//if you didn't use r1.toString(); and instead just write the following it will by default call our toStirng method.
		System.out.printf("R1: %.2f %s\n",r1.getValue(), r1);
		System.out.printf("R2: %.2f %s\n",r2.getValue(), r2);	
		System.out.printf("R3: %.2f %s\n",r3.getValue(), r3);	
		
		//PROGRAMMER'S NOTE:
		//MANY PROGRAMMERS USE toString TO PRINT OUT ALL THE VARIABLES IN AN 
		//OBJECT AT CERTAIN POINTS IN THEIR CODE TO SEE WHAT HAS HAPPENED WHEREEVER
		//THE STATUS OF OBJECT VARIABLES
		
	}

}
