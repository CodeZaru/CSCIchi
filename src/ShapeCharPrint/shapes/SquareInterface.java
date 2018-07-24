package shapes;

public interface SquareInterface extends RectangleInterface{
	/** Sets the square's dimensions. */ 
	public void set(int offset, int newSide); 
	
	public void set(int newSide); //KSNote: tried addinganother set method..didn't work 
}
