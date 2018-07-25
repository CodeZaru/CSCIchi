package shapes;

/**
 * A program that draws a fir tree composed of a triangle and a rectangle, both
 * drawn using keyboard characters.
 */

public class ShapeBaseDemo {

	public static final int INDENT = 5;
	public static final int TREE_TOP_WIDTH = 21;// must be odd
	public static final int TREE_BOTTOM_WIDTH = 4;
	public static final int TREE_BOTTOM_HEIGHT = 4;
	public static final int RANDOM_RIGHT_TRI_LEGA = 2;
	public static final int RANDOM_RIGHT_TRI_LEGB = 2;
	public static final int SIDE_LENGTH = 7;

	public static void main(String[] args) {
//		drawTree(TREE_TOP_WIDTH, TREE_BOTTOM_WIDTH, TREE_BOTTOM_HEIGHT);
		drawTree(TREE_TOP_WIDTH, TREE_BOTTOM_WIDTH, TREE_BOTTOM_HEIGHT, RANDOM_RIGHT_TRI_LEGA, RANDOM_RIGHT_TRI_LEGB, SIDE_LENGTH);

	}

//	public static void drawTree(int topWidth, int bottomWidth, int bottomHeight) {
	public static void drawTree(int topWidth, int bottomWidth, int bottomHeight, int legA, int legB, int side) {
		System.out.println(" textbook example.. Kevin's are down below!");
		TriangleInterface treeTop = new Triangle(INDENT, topWidth);
		System.out.println("Triangle offset: " + treeTop.getOffset ());//KS deBug LOC..
		drawTop(treeTop);
	
		RectangleInterface treeTrunk = new Rectangle(INDENT + 
										(topWidth / 2) - (bottomWidth / 2), 
										bottomHeight, bottomWidth);
		System.out.println("Rectangle offset: " + treeTrunk.getOffset ());//KS deBug LOC..
		drawTrunk(treeTrunk);

		RightTriangleInterface randomRightTri = new RightTriangle(INDENT, legA, legB);
		System.out.println("RIGHT Triangle offset: " + randomRightTri.getOffset ());//KS deBug LOC..
		drawRandomRightTri(randomRightTri);

		SquareInterface theSquare = new Square(INDENT, side);
		System.out.println("Square offset: " + theSquare.getOffset ());//KS deBug LOC..
		drawTheSquare(theSquare);
	}

	private static void drawTop(TriangleInterface treeTop) {
		treeTop.drawAt(1);
	}

	private static void drawTrunk(RectangleInterface treeTrunk) 
	{ 
		treeTrunk.drawHere(); // or treeTrunk.drawAt(0); 
	} 
	
	private static void drawRandomRightTri(RightTriangleInterface randomRightTri) 
	{ 
		randomRightTri.drawHere(); // ; 
	} 
	
	private static void drawTheSquare(SquareInterface theSquare) 
	{ 
		theSquare.drawHere(); // ; 
	} 
	
}
	
	
