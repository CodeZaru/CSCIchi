package personHW;

import java.util.Scanner;

public class ExceptionDemoEH {

	public static void main(String[] args) {

		int empCount = 0;
		int salarySum = 0;
		
		String response;
				
	EmployeeEH [] employee = new EmployeeEH[100];
			
//		people[empCount] = new Faculty("Jack",1,"DeptA","Prof of CS");
	System.out.println("##################################################");
	System.out.println("Would you like to enter an employee? (type yes or no)");
	Scanner keyboard = new Scanner(System.in);
	response = keyboard.next();
	if (response.equalsIgnoreCase("yes")) {
		do {
			empCount++;
			EmployeeEH test1 = new EmployeeEH();
			employee[empCount] = test1;
			test1.readInput();
			//test1.writeOutput(test1);
			System.out.println("##################################################");
			System.out.println("Would you like to enter another? (type yes or no)");
			response = keyboard.next();
		} while (response.equalsIgnoreCase("yes"));

		
		for(int i=0; i < employee.length;i++) {
			salarySum+=employee[i].getSalary();
			if (employee[i].getSalary() < salarySum/empCount)
				System.out.println("employee " + employee[i] + "salary less than avg.");
			System.out.println("employee " + employee[i] + "salary above the avg.");
		}


	}
	}
}



