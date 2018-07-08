import java.util.Scanner;
	
public class RatNumGCD 
{
		private int numerator;
		private int denominator;
		private int GCD;
		
		
		RatNumGCD() 
		{
			numerator = 0;
			denominator = 1;
			simplify();
		}
		
		RatNumGCD(int origNumeratorArg, int origDenominatorArg)
		{
			simplify(origNumeratorArg,origDenominatorArg);
		}
		

		private void simplify()
		{		
			readInput();
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
			GCD = getGCD(origNumeratorArg, origDenominatorArg);
			if (GCD== -1) System.out.println("ERROR CODE -1");
			if (GCD == 0) System.out.println("Rational number with zero in the numerator");
			else 
			{			
			numerator = origNumeratorArg/GCD;
			denominator = origDenominatorArg/GCD;
			}
		}
		
		private void simplify(RatNumGCD CTO)
		{
			GCD = getGCD(CTO.numerator, CTO.denominator);
			if (GCD== -1) System.out.println("ERROR CODE -1");
			if (GCD == 0) System.out.println("Rational number with zero in the numerator");
			else 
			{	
			numerator = CTO.numerator/GCD;
			denominator = CTO.denominator/GCD;
			}
		}
		
		private static int getGCD(int x, int y)
		{			
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
//					return gCD = i;	
					}
				}
			return gCD;
		}
		
		public String toString() 
		{
			return numerator + " / " + denominator + "\n";
		}
		
		public double getValue() 
		{
			return (double)numerator / (double)denominator;		
		}
		
		public double getValue(RatNumGCD CTO) 
		{
			return (double)numerator / (double)denominator;		
		}
		
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
		
		public void writeOutput(RatNumGCD CTO)
		{
			System.out.println("We stored your numerator and denominator as rational values: "  + CTO);
			System.out.println("The values as primitive data type Double is: " + getValue(CTO));
		}
		
		
		public static void main(String[] args) {
			

			System.out.println("*************************************");
			System.out.println("TEST CASE 1");
			System.out.println("*************************************");
			System.out.println("Numerator is 105 and denominator is 25");
			RatNumGCD test1 = new RatNumGCD(105, 25);
			System.out.println("Stored values toString: " + test1);
			System.out.println("Stored values Double: " + test1.getValue());

			System.out.println(" ");
			System.out.println("#############################################");
			System.out.println(" ");
			

			System.out.println("*************************************");
			System.out.println("TEST CASE 2");
			System.out.println("*************************************");
			System.out.println("Numerator is 50 and denominator is 10");
			RatNumGCD test2 = new RatNumGCD(50, 10);
			System.out.println("Stored values toString: " + test2);
			System.out.println("Stored values Double: " + test2.getValue());

			System.out.println(" ");
			System.out.println("#############################################");
			System.out.println(" ");
			

			System.out.println("*************************************");
			System.out.println("TEST CASE 3");
			System.out.println("*************************************");
			System.out.println("Numerator is 13 and denominator is 5");
			RatNumGCD test3 = new RatNumGCD(13, 5);
			System.out.println("Stored values toString: " + test3);
			System.out.println("Stored values Double: " + test3.getValue());

			System.out.println(" ");
			System.out.println("#############################################");
			System.out.println(" ");
			

			System.out.println("*************************************");
			System.out.println("TEST CASE 4");
			System.out.println("*************************************");
			System.out.println("Numerator is 0 and denominator is 10");	
			RatNumGCD test4 = new RatNumGCD(0, 10);
			System.out.println("Stored values toString: " + test4);
			System.out.println("Stored values Double: " + test4.getValue());

			System.out.println(" ");
			System.out.println("#############################################");
			System.out.println(" ");
			

			System.out.println("*************************************");
			System.out.println("TEST CASE 5");
			System.out.println("*************************************");
			System.out.println("Numerator is 10 and denominator is 10");		
			RatNumGCD test5 = new RatNumGCD(10, 10);
			System.out.println("Stored values toString: " + test5);
			System.out.println("Stored values Double: " + test5.getValue());	

		}
		
	}

