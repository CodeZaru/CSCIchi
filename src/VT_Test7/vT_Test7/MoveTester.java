package vT_Test7;

import java.awt.Rectangle;

public class MoveTester {

	public static void main(String[] args) {
		// declare and instantiate a Rectangle object
		Rectangle box = new Rectangle(5, 10, 20, 30);
		Rectangle box2 = box;
		
		// Move the rectangle
		box.translate(15, 25);
		
		// Print information about the moved rectangle
		System.out.println("Test1");		
		System.out.print("x: ");
		System.out.println(box.getX());
		System.out.println("Expected: 20");
		System.out.println();
		System.out.print("y: ");
		System.out.println(box.getY());
		System.out.println("Expected: 35");
		System.out.println();
		System.out.println(box);
		System.out.println(box2);
		System.out.println();
		System.out.println("Test2");		
		box2.translate(18, 3);
		System.out.println(box);
		System.out.println(box2);
		
	}

}
