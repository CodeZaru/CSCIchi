package shapes;

	/**
	 * Class for drawing rectangles on the screen using keyboard characters. Each
	 * character is higher than it is wide, so these rectangles will look taller
	 * than you might expect. Inherits getOffset, setOffset, and drawAt from the
	 * class ShapeBasics.
	 */
	public class Square extends Rectangle implements SquareInterface {
		private int side;


//		public Square() {
//			super();
//			side = 5;
//			height = 0;
//			width = 0;
//		}
//1) Create SquareInterface and extend it in sync with this class.. i.e. "extends RectangleInterface "
//2) add SquareInterface set method that includes all required args for constructor in Square class 
//   that also updates the ShapeBaseInterface (specifically the offset instance variable via rectangle).	
//3) Added setOffset (int newOffset) and getOffset () to ShapeBase.java
//4) Both methods are also in ShapeInterface.java
//4) Added super.setOffset(theOffset); to the Square constructor below //KS Note: the super modifier is optional here	
//5) Added set method to Square class with same signature as the SquareInterface
//6) Make sure not to let automagic Eclipse get method override the super (like getOffset() that is commented out below.)  
//7) Created a constructor in square class that takes one arg for side, and sent it to super(arg1,arg2)
//   see first constructor below, then added a constructor to rectangle to account for two args meaning sides are same length..		

		public Square(int theOffset, int theSide) {
			//setOffset(theOffset);//KS Note: this triggered error on stub even with "super." but super(theOffset) worked
			super(theOffset, theSide);//KS Note: this seems to be the solution...
										//KS Note: Ask professor about this part...and the square interface extends LOC.
		}

		public void set(int newSide) {
			side = newSide;
		}

		public void drawHere()
		{ 
	//		drawHorizontalLine(); 
	//		drawSides(); 
	//		drawHorizontalLine(); 
			super.drawHere();
		}

		private void drawHorizontalLine() {
			skipSpaces(getOffset());
			for (int count = 0; count < side; count++)
				System.out.print('-');
			System.out.println();
		}

		private void drawSides() {
			for (int count = 0; count < (side - 2); count++)
				drawOneLineOfSides();
		}

		private void drawOneLineOfSides() 
		{ 
			skipSpaces(getOffset()); 
			System.out.print('|'); 
			skipSpaces(side - 2); 
			System.out.println('|'); 
			} 
		// Writes the indicated number of spaces. 
		
		private static void skipSpaces(int number) 
		{ 
			for (int count = 0; count < number; count++) 
				System.out.print(' ');
		}

//		@Override
//		public void setOffset(int newOffset) {
//			// TODO Auto-generated method stub
			
//		}

//		@Override
//		public int getOffset() {
//			// TODO Auto-generated method stub
//			return 0;
//		}

		@Override
		public void set(int offset, int side) {
			// TODO Auto-generated method stub
			
		}
		
		public static void main (String[] args) 
		{		
		SquareInterface theSquare = new Square(5, 7);
		System.out.println("Square offset: " + theSquare.getOffset ());//KS deBug LOC..
		//drawTheSquare(theSquare);
		Square theSquare2 = new Square(5, 7);
		theSquare.drawHere();
		theSquare2.drawHere();
		}
		private static void drawTheSquare(SquareInterface theSquare) 
		{ 
			theSquare.drawHere(); // ; 
		} 
		
				
	 } 
