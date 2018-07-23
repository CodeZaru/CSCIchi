package shapes;

/**
 * Class for drawing triangles on the screen using keyboard characters. A
 * triangle points up. Its size is determined by the length of its base, which
 * must be an odd integer. Inherits getOffset, setOffset, and drawAt from the
 * class ShapeBasics.
 */
public class Triangle extends ShapeBase implements TriangleInterface {
	private int base;

	public Triangle() {
		super();
		base = 0;
	}
//1) Added offSet to the TriangleInterface set method
//2) Added setOffset (int newOffset) and getOffset () to ShapeBase.java
//3) Both methods are also in ShapeInterface.java
//4) Added super.setOffset(theOffset); to the Triangle constructor below //KS Note: the super modifier is optional here	
//5) Added set method to Triangle class with same signature as the TriangleInterface
//6) Make sure not to let automagic Eclipse get method override the super (like getOffset() that is commented out below.)  

	public Triangle(int theOffset, int theBase) {
		//super.setOffset(theOffset);//KS Note: the super modifier is optional here
		setOffset(theOffset);//orig: super(theOffset);
		base = theBase;
	}

	/** Precondition: newBase is odd. */
	public void set(int newBase) {
		base = newBase;
	}

	public void drawHere() {
		drawTop();
		drawBase();
	}

	private void drawBase() 
	{ 
		skipSpaces(getOffset()); 
		for (int count = 0; count < base; count++) 
			System.out.print('*'); 
		System.out.println(); 		
	}

	private void drawTop() 
	{ 
		//startOfLine == number of spaces to the 
		//first '*' on a line. Initially set to the 
		//number of spaces before the topmost '*'. 
		int startOfLine = getOffset() + base / 2; 
		skipSpaces(startOfLine); 
		System.out.println('*');//top '*' 
		int lineCount = base / 2 - 1;//height above base 
		
		//insideWidth == number of spaces between the 
		//two '*'s on a line. 
		int insideWidth = 1; 
		for (int count = 0; count < lineCount; count++) 
		{ //Down one line, so the first '*' is one more 
			//space to the left. 
			startOfLine --;
			skipSpaces(startOfLine); 
			System.out.print('*'); 
			skipSpaces(insideWidth); 
			System.out.println('*'); 
			
			//Down one line, so the inside is 2 spaces wider. 
			insideWidth = insideWidth + 2; 
		} 
	} 
	
	private static void skipSpaces(int number) 
	{ 
		for (int count = 0; count < number; count++) 
			System.out.print(' '); 
	}

//	@Override
//	public void setOffset(int newOffset) {
		// TODO Auto-generated method stub
		
//	}

//KS IMPORTANT NOTE: ECLIPSE ERROR HELP AUTOMATICALLY GENERATED THIS getOffset() method
//But it is not in the TriangleInterface (just the ShapeInterface which is a super, so
//we don't need it in the Triangle class and it 
//Causes Problems b/c it was set to return 0 instead of the actual offset that we set, 
//which was 5...
//	@Override
//	public int getOffset() {
//		// TODO Auto-generated method stub
//		return 0;
//	}

	@Override
	public void set(int offSet, int newBase) {
		// TODO Auto-generated method stub
		
	} 

}