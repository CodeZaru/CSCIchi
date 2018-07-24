package shapes;

/**
 * Class for drawing rectangles on the screen using keyboard characters. Each
 * character is higher than it is wide, so these rectangles will look taller
 * than you might expect. Inherits getOffset, setOffset, and drawAt from the
 * class ShapeBasics.
 */
public class Rectangle extends ShapeBase implements RectangleInterface {
	private int height;
	private int width;
	

//	public Rectangle() {
//		super();
//		height = 0;
//		width = 0;
//	}

	public Rectangle(int theOffset, int theHeight, int theWidth) {
		setOffset(theOffset);//super(theOffset);
		height = theHeight;
		width = theWidth;
	}
//KS Note: added the below for square class which extends rectangle
	public Rectangle(int theOffset, int theSide) {
		setOffset(theOffset);//super(theOffset);
		height = theSide;
		width =  theSide;
	}
	
	public void set(int newHeight, int newWidth) {
		height = newHeight;
		width = newWidth;
	}

	public void drawHere()
	{ 
		drawHorizontalLine(); 
		drawSides(); 
		drawHorizontalLine(); 
	}

	private void drawHorizontalLine() {
		skipSpaces(getOffset());
		for (int count = 0; count < width; count++)
			System.out.print('-');
		System.out.println();
	}

	private void drawSides() {
		for (int count = 0; count < (height - 2); count++)
			drawOneLineOfSides();
	}

	private void drawOneLineOfSides() 
	{ 
		skipSpaces(getOffset()); 
		System.out.print('|'); 
		skipSpaces(width - 2); 
		System.out.println('|'); 
		} 
	// Writes the indicated number of spaces. 
	
	private static void skipSpaces(int number) 
	{ 
		for (int count = 0; count < number; count++) 
			System.out.print(' ');
	}

//	@Override
//	public void setOffset(int newOffset) {
//		// TODO Auto-generated method stub
		
//	}

//	@Override
//	public int getOffset() {
//		// TODO Auto-generated method stub
//		return 0;
//	}

	@Override
	public void set(int offset, int newHeight, int newWidth) {
		// TODO Auto-generated method stub
		
	}

	public static void main (String[] args) 
	{		
	RectangleInterface theRectangle = new Rectangle(5, 7);
	System.out.println("Rectangle offset: " + theRectangle.getOffset ());//KS deBug LOC..
//	System.out.println("Rectangle offset: " + theRectangle.height);//KS deBug LOC..
//	System.out.println("Rectangle offset: " + theRectangle.width);//KS deBug LOC..
	//drawTheSquare(theRectangle);
	theRectangle.drawHere();
	}
	private static void drawTheRectangle(RectangleInterface theRectangle) 
	{ 
		theRectangle.drawHere(); 
	} 

	
	
	
	
 } 