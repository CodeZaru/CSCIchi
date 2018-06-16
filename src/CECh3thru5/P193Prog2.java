import java.util.Scanner;

public class P193Prog2 {

	public static void main(String[] args) {

		System.out.print("Enter three non-negative integer numers: ");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		
		int smallest = Math.min(x, Math.min(y,z));

		int largest = Math.max(x, Math.max(y,z));

		int middle = 0;
		
		if (x!=smallest & x!=largest)
			middle = x;
		else if (y!=smallest & y!=largest)
			middle = y;
		else
			middle = z;
	
		System.out.println("smallest is: " + smallest);
		System.out.println("middle is: " + middle);
		System.out.println("largest is: " + largest);
	
	}

}



/*
 * example 1
 * nested if and else and solve the x as smalles then medium then largest...
 * if ((x>y)&&(..
 * 
 * 
 * example 2
 * 
 * if ((x>y) && (x>z) && (y<z))
*/

