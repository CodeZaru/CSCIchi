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


public class RatNumGCDWithNotes 
{
	private int numerator;
	private int denominator;
	
	//Try to use wrapper classes to box and unbox primitive types p413
	//also study autoType conversion p298--can always move right but not to the left
	//byte => short => int => long => float => double
	//so you can do the following two lines:
	//int intVariable = 7; 
	//double doubleVariable = intVariable;
	//and the Math class.. p410
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
		//it will receive two integers, but will need to convert 
		//to float of double and use modulus to find GCD
		double numerator = x;
		double denominator = y;
		
		//higher level analysis of the numbers:  denominator > 0; x != y; 
		//Math.min(x, y); does the lesser go into the larger w/o remainder?
		//is the lesser even or odd divisible by 2, if no remainder then is bigger divisible by same
		//if not then iterate from modulus of half all the way to one.. 
		//if the only common GCD is one then they are in simplest form
		//could create another method to keep code simple that checks same, smaller, half smaller,  
		//or returns index to start the search.
		//the GCD search is a loop that tries factors starting at returned index
		//and if smaller is divisible then try it against larger.  
		//logical operation if both are divisible by i then return i otherwise decrement i and try again.
		//if remainder exists then go to the next.
		//if smaller doesn't go into larger then does half smaller go into it?
		//if one id the only common factor, then it is already in simplest form
		//then possibly convert back to int
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
