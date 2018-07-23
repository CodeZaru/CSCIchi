package shapes;
//import interfaces.ShapeInterface;

/**
 * Abstract base class for drawing simple shapes on the screen using characters.
 */

public abstract class ShapeBase implements ShapeInterface {
	private int offset;

	public abstract void drawHere();

	public void drawAt(int lineNumber) {
		for (int count = 0; count < lineNumber; count++)
			System.out.println();
		drawHere();
	}
	
	public int getOffset ()
	{
		return offset;
	}
	public void setOffset (int newOffset)
	{
		offset = newOffset;
	}
	
}
