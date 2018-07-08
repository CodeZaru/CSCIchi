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

import java.util.Scanner;

public class RatNumGCDWithNotes 
{
	private int numerator;
	private int denominator;
	private int GCD;
	
	//Try to use wrapper classes to box and unbox primitive types p413
	//also study autoType conversion p298--can always move right but not to the left
	//byte => short => int => long => float => double
	//so you can do the following two lines:
	//int intVariable = 7; 
	//double doubleVariable = intVariable;
	//and the Math class.. p410
	//not for this program but for arrays---sorting searching cloning etc...
	//sequential search page 530.
	
	RatNumGCDWithNotes() 
	{
		numerator = 0;
		denominator = 1;
		//readInput();
		simplify();
	}
	
	RatNumGCDWithNotes(int origNumeratorArg, int origDenominatorArg)
	{
		//this is a constructor that takes two args and 
		//before saving the instance variables it calls
		//the setter method "simplify" which calls 
		//the static method GCD to perform its operation
		//and upon finishing, this code saves the numerator and denominator
		//instance variables in simplest form
//		numerator = origNumeratorArg;//converted to simplified form
//		denominator = origDenominatorArg;//converted to simplified form			
		simplify(origNumeratorArg,origDenominatorArg);
	
	}
	
	//THINK  about Interface/Encapsulation when doing the following
	//WRITE ACCORDING TO PAGE 303 precondition/postcondition
	//AND PAGE 327/328 JAVADOC and UML...
	//
	private void simplify()
	{		
		//this is a setter method if it changes the private instance variables
		//this method takes origNumeratorArg and origDenominatorArg
		//calls the getGCD method to get the GCD and 
		//uses the GCD to reduce to simpNumerator and simpDenominator
		readInput();
		//System.out.println(numerator + denominator);
		GCD = getGCD(numerator, denominator);
		if (GCD== -1) System.out.println("ERROR CODE -1");
		if (GCD == 0) System.out.println("Rational number with zero in the numerator");
		else 
		{	
		numerator = numerator/GCD;
		denominator = denominator/GCD;
		}
	}
	
	private void simplify(int origNumeratorArg, int origDenominatorArg)
	{		
		//this is a setter method if it changes the private instance variables
		//this method takes origNumeratorArg and origDenominatorArg
		//calls the getGCD method to get the GCD and 
		//uses the GCD to reduce to simpNumerator and simpDenominator
		GCD = getGCD(origNumeratorArg, origDenominatorArg);
		if (GCD== -1) System.out.println("ERROR CODE -1");
		if (GCD == 0) System.out.println("Rational number with zero in the numerator");
		else 
		{			
		numerator = origNumeratorArg/GCD;
		denominator = origDenominatorArg/GCD;
		}
	}
	
	private void simplify(RatNumGCDWithNotes CTO)
	{
		GCD = getGCD(CTO.numerator, CTO.denominator);
		numerator = CTO.numerator/GCD;
		denominator = CTO.denominator/GCD;
	}
	
	private static int getGCD(int x, int y)
	{
		//this method is an interesting one..
		//it will receive two integers, but will need to convert 
		//to float of double and use modulus to find GCD
		
		double numerator = x;
		double denominator = y;
		int gCD = 0;
		//higher level analysis of the numbers:  denominator > 0; x != y; 
		if (y < 1) return -1;//check for denominator of 0, and if so then return error code.
		if (x == 0) return 0;//zero in numerator is rational.
		if (x==y) return y;//quick equality check: logical shortcut to set up next logical shortcut
		if (Math.max(numerator, denominator) % Math.min(numerator, denominator) == 0) return Math.min(x, y);//check smaller go into larger

		if ((Math.min(numerator, denominator) % 2 == 0) && 
				(Math.max(numerator, denominator) % (Math.min(numerator, denominator)/2)==0)) return (Math.min(x, y)/2);
		else
			{
			for (int i = Math.min(x, y)/2; i >= 1; i--) 
				{
				System.out.println("shortcut GCD for loop: GCD attempt = " + i);
				System.out.println("(Math.min(x, y) % i: " + (Math.min(x, y) % i));
				System.out.println("(Math.max(x, y) % i: " + (Math.max(x, y) % i));
				if ((Math.min(x, y) % i == 0) && (Math.max(x, y) % i == 0)) 
					{
					System.out.println("GCD: " + i);
					System.out.println("GCD: " + i);

					return gCD = i;				
					}
//				return gCD = i;	
				}
			}
		//control the zero denominator at data entry, but check anyway. 
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
		return gCD;
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
	
	public double getValue() {
		
		return (double)numerator / (double)denominator;		
	}
	
	public double getValue(RatNumGCDWithNotes CTO) {
		
		return (double)numerator / (double)denominator;		
	}
	
	//PROGRAMMER'S NOTE:
	//MANY PROGRAMMERS USE toString TO PRINT OUT ALL THE VARIABLES IN AN 
	//OBJECT AT CERTAIN POINTS IN THEIR CODE TO SEE WHAT HAS HAPPENED WHEREEVER
	//THE STATUS OF OBJECT VARIABLES
	
	/**
	 * Reads from keyboard the numerator and denominator input
	 */
	public void readInput()
	{
		numerator = -1;
		denominator = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter numerator (positive integer)");
		while(numerator < 0)
			{//try again
			System.out.println("numerator must be a positive integer");
			numerator = keyboard.nextInt();
			}
		System.out.println("You entered: " + numerator);
		System.out.println("Enter a positive integer for the denominator (can't be zero)");
		while(denominator <= 0)
			{//try again
			System.out.println("denominator must be an integer > 0");
			denominator = keyboard.nextInt();
			}		
		System.out.println("You entered: " + denominator);
		
		simplify(numerator, denominator);
	}
	
	public void writeOutput(RatNumGCDWithNotes CTO)
	{
		System.out.println("We stored your numerator and denominator as rational values: "  + CTO);
		System.out.println("The values as primitive data type Double is: " + getValue(CTO));
	}
	
	
	public static void main(String[] args) {
		

		System.out.println("*************************************");
		System.out.println("TEST CASE 1");
		System.out.println("*************************************");
		System.out.println("Numerator is 105 and denominator is 25");
		RatNumGCDWithNotes test1 = new RatNumGCDWithNotes(105, 25);
		System.out.println("Stored values toString: " + test1);
		System.out.println("Stored values Double: " + test1.getValue());

		System.out.println(" ");
		System.out.println("#############################################");
		System.out.println(" ");
		

		System.out.println("*************************************");
		System.out.println("TEST CASE 2");
		System.out.println("*************************************");
		System.out.println("Numerator is 50 and denominator is 10");
		RatNumGCDWithNotes test2 = new RatNumGCDWithNotes(50, 10);
		System.out.println("Stored values toString: " + test2);
		System.out.println("Stored values Double: " + test2.getValue());

		System.out.println(" ");
		System.out.println("#############################################");
		System.out.println(" ");
		

		System.out.println("*************************************");
		System.out.println("TEST CASE 3");
		System.out.println("*************************************");
		System.out.println("Numerator is 13 and denominator is 5");
		RatNumGCDWithNotes test3 = new RatNumGCDWithNotes(13, 5);
		System.out.println("Stored values toString: " + test3);
		System.out.println("Stored values Double: " + test3.getValue());

		System.out.println(" ");
		System.out.println("#############################################");
		System.out.println(" ");
		

		System.out.println("*************************************");
		System.out.println("TEST CASE 4");
		System.out.println("*************************************");
		System.out.println("Numerator is 0 and denominator is 10");	
		RatNumGCDWithNotes test4 = new RatNumGCDWithNotes(0, 10);
		System.out.println("Stored values toString: " + test4);
		System.out.println("Stored values Double: " + test4.getValue());

		System.out.println(" ");
		System.out.println("#############################################");
		System.out.println(" ");
		

		System.out.println("*************************************");
		System.out.println("TEST CASE 5");
		System.out.println("*************************************");
		System.out.println("Numerator is 10 and denominator is 10");		
		RatNumGCDWithNotes test5 = new RatNumGCDWithNotes(10, 10);
		System.out.println("Stored values toString: " + test5);
		System.out.println("Stored values Double: " + test5.getValue());	

	}
	
}
