import java.util.Scanner;

public class P258Prog6 {

	public static void main(String[] args) {
	
		System.out.println("input all grades separated by space, ENTER NEGATIVE NUMBER WHEN DONE");
		Scanner keyboard = new Scanner(System.in);
		int grade; 
		grade = keyboard.nextInt();
		
//		int lowest = 100, highest = 0;
		int lowest = grade, highest = grade;//another approach
		
		boolean moreGrades = true;
		 int countA = 0; 
		 int countB = 0;
		 int countC = 0;
		 int countD = 0;
		 int countF = 0;
		
//		while (moreGrades = true) {
		while (grade > 0) {
			if (grade > 90) {countA += 1;}
			else if (grade > 80) {countB += 1;}
			else if (grade > 70) {countC += 1;}		
			else if (grade > 60) {countD += 1;}
			else if (grade > 0) {countF += 1;}
	//		else if (grade < 0) {moreGrades = false;}
			grade = keyboard.nextInt();			
			
			if ((grade < lowest) && (grade >= 0))
				lowest = grade;
			
			if ((grade > highest) && (grade <= 100))
				highest = grade;
			
		}

		System.out.println("countA: " + countA);
		System.out.println("countB: " + countB);
		System.out.println("countC: " + countC);
		System.out.println("countD: " + countD);
		System.out.println("countF: " + countF);
		System.out.println("highest: " + highest);
		System.out.println("lowest: " + lowest);
		
		keyboard.close();
}
	
}

/* variables:
 * sentinel: Boolean moreGrades = true;
 * int countA 
 * int countB
 * int countC
 * int countD
 * int countF
 * 
 * while (moreGrades) {
 * 
 * 
 * }
 * 
 */
