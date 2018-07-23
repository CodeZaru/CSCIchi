package shapes;

	/**
	 * Class for drawing triangles on the screen using keyboard characters. A
	 * triangle points up. Its size is determined by the length of its base, which
	 * must be an odd integer. Inherits getOffset, setOffset, and drawAt from the
	 * class ShapeBasics.
	 */
	public class RightTriangle extends ShapeBase implements RightTriangleInterface {
		private int legA;
		private int legB;

		public RightTriangle() {
			super();
			legA = 0;
			legB = 0;
		}
	//1) Create RightTriangleInterface and extend it in sync with this class.. i.e. "extends ShapeInterface "
	//2) add TriangleInterface set method that includes all required args for constructor in RightTriangle class 
	//   that also updates the ShapeBaseInterface (specifically the offset instance variable).	
	//3) Added setOffset (int newOffset) and getOffset () to ShapeBase.java
	//4) Both methods are also in ShapeInterface.java
	//4) Added super.setOffset(theOffset); to the Triangle constructor below //KS Note: the super modifier is optional here	
	//5) Added set method to Triangle class with same signature as the TriangleInterface
	//6) Make sure not to let automagic Eclipse get method override the super (like getOffset() that is commented out below.)  
	//7) Pythagorean Theorem: a^2+b^2=c^2 where a and b are the legs and c is the hypotenuse.
		
		public RightTriangle(int theOffset, int legAArg, int legBArg) {
			//super.setOffset(theOffset);//KS Note: the super modifier is optional here
			setOffset(theOffset);//orig: super(theOffset);
			legA = legAArg;
			legB = legBArg;
		}

		/** Precondition: newBase is odd. */
		public void set(int legAArg, int legBArg) {
			legA = legAArg;
			legB = legBArg;
		}

		public void drawHere() {
			drawTop();
			drawBase();
		}

		private void drawBase() 
		{ 
			skipSpaces(getOffset()); 
			for (int count = 0; count < ((legA*legA) + (legB*legB)); count++) 
				System.out.print('*'); 
			System.out.println(); 		
		}

		private void drawTop() 
		{ 
			//startOfLine == number of spaces to the 
			//first '*' on a line. Initially set to the 
			//number of spaces before the topmost '*'. 
			int startOfLine = getOffset();////KS Note: changed for rightTri...was + base / 2; 
			skipSpaces(startOfLine); 
			System.out.println('*');//top '*' 
			int lineCount = ((legA*legA) + (legB*legB)) - 1;//KS Note: the sum of the squares of 
			//the two legs results in the count of hypotenus "*" 
			
			//insideWidth == number of spaces between the 
			//two '*'s on a line. 
			int insideWidth = 1; 
			for (int count = 0; count < lineCount; count++) 
			{ //Down one line, so the first '*' is one more 
				//space to the left. 
				//startOfLine --; KS Note: RightTriangle Adjustment is to remove decrement
				skipSpaces(startOfLine); 
				System.out.print('*'); 
				skipSpaces(insideWidth); 
				System.out.println('*'); 
				
				//Down one line, so the inside is 2 spaces wider. 
				insideWidth = insideWidth + 1;//2; KS Note: RightTriangle Adjustment from 2 to 1
			} 
		} 
		
		private static void skipSpaces(int number) 
		{ 
			for (int count = 0; count < number; count++) 
				System.out.print(' '); 
		}

//		@Override
//		public void setOffset(int newOffset) {
			// TODO Auto-generated method stub
			
//		}

	//KS IMPORTANT NOTE: ECLIPSE ERROR HELP AUTOMATICALLY GENERATED THIS getOffset() method
	//But it is not in the TriangleInterface (just the ShapeInterface which is a super, so
	//we don't need it in the Triangle class and it 
	//Causes Problems b/c it was set to return 0 instead of the actual offset that we set, 
	//which was 5...
//		@Override
//		public int getOffset() {
//			// TODO Auto-generated method stub
//			return 0;
//		}

		@Override
		public void set(int offSet,  int legAArg, int legBArg) {
			// TODO Auto-generated method stub
			
		} 
		
		public static void main (String[] args) 
		{		
		RightTriangleInterface randomRightTri = new RightTriangle(5, 2, 2);
		System.out.println("Triangle offset: " + randomRightTri.getOffset ());//KS deBug LOC..
		drawRandomRightTri(randomRightTri);
		}
		private static void drawRandomRightTri(RightTriangleInterface randomRightTri) 
		{ 
			randomRightTri.drawHere(); // ; 
		} 	

}
