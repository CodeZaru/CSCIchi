


public class Rational {

	//project specification says GCD needs to be static, b/c they want to illustrate the concept that you need to learn from ch 6.
	//could have multiple rational numbers..
	
	private int numerator;
	private int denominator;
	Rational() {
		this.numerator = 0;
		this.denominator = 1;		
	}
	
	Rational(int numerator, int denominator){
		if(denominator == 0) {//note that in this case, YOU CANNOT USE this.denominator or it will pull the one from private int denominator (which is zero by default) 
			//You could also make your local variable a different name which would eliminate the need for this (I think)
			//the local variable passed in via the arg, as opposed this 
			
			System.out.println("Fatal error, denominator cannot be zero.");
			System.exit(0);//don't use "break" b/c it will only break you out of the constructor and go to the next line of code..
		}
		
		this.numerator = numerator;
		this.denominator = denominator;
		//convert resulting ratio to simplified form means call simplify().
		//
		this.simplify();
	}
	
	
	private void simplify() {

		//think of this as a set method for numerator and denominator
		//this.numerator = this.numerator / this.getGCD(numerator,  denominator);
		//can rewrite the above as below and actually don't need "this" b/c there is no local variable, but can use this if de

		//read after write issue will occur
		//getGCD(numerator,  denominator);
		//getGCD(numerator,  denominator);
//so do one of the next two approaches:		

/*
		int x = numerator;
		int y = denominator;
			
		numerator /= getGCD(x,  y);
		denominator /= getGCD(x,  y);
*/		
		int gcd = getGCD(numerator, denominator);
		numerator /= gcd;
		denominator /= gcd;
	
	}
	
	private static int getGCD(int numerator, int denominator) {
	//	return 0;
		return 1;
		
		//THIS IS THE MAIN PART OF THE PROBLEM LEFT TO SOLVE
		//NEED A LOOP ETC....
		
		//could try recursion, which uses your stack memory but less code memory.
	}

	public double getValue() {
		
		return (double)numerator / (double)denominator;		
	}
	
	
	public String toString() {
		//we are doing an over-write of what java already provides us with toString, 
		//so that we get the output as we want it.
		//return " ";//simple version
		//toString tells you what class the object is and then @ "at" and the memory location
		//Also went back to the Temperature method 
		return numerator + " / " + denominator + "\n";
	}
	
	//PROGRAMMER'S NOTE:
	//MANY PROGRAMMERS USE toString TO PRINT OUT ALL THE VARIABLES IN AN 
	//OBJECT AT CERTAIN POINTS IN THEIR CODE TO SEE WHAT HAS HAPPENED WHEREEVER
	//THE STATUS OF OBJECT VARIABLES
	
}
