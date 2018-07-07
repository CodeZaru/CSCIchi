/*Write and fully test a class that represents rational numbers.
 * A rational number can be represented as the ratio of two integer values, a and b, where b is not zero.
 *   
 * The class has attributes for the numerator and denominator of this ratio.  
 * 
 * The ratio should always be stored in its simplest form.  
 * That is, any common factor of a and b should be removed.
 * For example, the rational number 40/12 should be stored as 10/3.
 * 
 * The class has the following constructors and methods:
 * 
 * A default constructor that sets the rational number to 0/1.
 * 
 * A constructor that has parameters for the numerator and denominator 
 * and converts the resulting ratio to simplified form.
 * 
 * simplify: a private method that converts the rational number to simplified form.
 * 
 *  getGCD(x, y): a private static method that returns the largest common factor
 *  of the two positive integers x and y, that is, 
 *  their greatest common divisor.  For example, the greatest common divisor of 40 and 12 is 4.
 *  
 *  getValue: returns the rational number as a double value.
 *  toString: returns the rational number as a string in the form a/b. 
*/


public class RatNumGCD 
{
	private int numerator;
	private int denominator;
	
	//Try to use wrapper classes to box and unbox primitive types
	//also study autoType conversion p298
	//and the Math class..
	//not for this program but for arrays---sorting searching cloning etc...
	//sequential search page 530.
	
	RatNumGCD() 
	{
		numerator = 0;
		denominator = 1;
	}
	
	RatNumGCD(int origNumeratorArg, int origDenominatorArg)
	{
		//this is a constructor that takes two args and 
		//before saving the instance variables it calls
		//the setter method "simplify" which calls 
		//the static method GCD to perform its operation
		//and upon finishing, this code saves the numerator and denominator
		//instance variables in simplest form
		numerator = origNumeratorArg;//converted to simplified form
		denominator = origDenominatorArg;//converted to simplified form			
	}
	
	//THINK  about Interface/Encapsulation when doing the following
	//WRITE ACCORDING TO PAGE 303 precondition/postcondition
	//AND PAGE 327/328 JAVADOC and UML...
	//
	private void simplify(int origNumeratorArg, int origDenominatorArg)
	{
		//this is a setter method if it changes the private instance variables
		//this method takes origNumeratorArg and origDenominatorArg
		//calls the getGCD method to get the GCD and 
		//uses the GCD to reduce to simpNumerator and simpDenominator
		
	}
	
	private static int getGCD(int x, int y)
	{
		//this method is an interesting one..
		//it will perform 
		return x/y;
	}
	
	public String toString() {
		//we are doing an over-write of what java already provides us with toString,
		//so that we get the output as we want it.
		//return " ";//will return blank
		//If you don't define a toString method in the class file, then 
		//then the toString will return by default the class the object is
		//and then @ "at" and the memory location
		return numerator + " / " + denominator + "\n";
	}
	
	//PROGRAMMER'S NOTE:
	//MANY PROGRAMMERS USE toString TO PRINT OUT ALL THE VARIABLES IN AN 
	//OBJECT AT CERTAIN POINTS IN THEIR CODE TO SEE WHAT HAS HAPPENED WHEREEVER
	//THE STATUS OF OBJECT VARIABLES
	
	public void readInput()
	{
	
	}
	
	public void writeOutput()
	{
		
	}
	
}
