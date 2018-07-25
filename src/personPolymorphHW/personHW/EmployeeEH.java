package personHW;

import java.util.Scanner;

public class EmployeeEH extends Person {
	
	private int SSN;
	private int salary;
	
	EmployeeEH(){
		super();
		SSN = 000000000;
		salary = 0;
		
	}
	
	EmployeeEH(String initName, int initSSN, int initSalary){
		super(initName);
		SSN = initSSN;
		salary = initSalary;
	}
	
	public void reset (String newName, int newSSN, int newSalary) {
		setName(newName);
		SSN = newSSN;
		salary = newSalary;
		
	}
	
	public void setSSN (int newSSN) {
		SSN = newSSN;
	}

	public void setDept (int newSalary) {
		salary = newSalary;
	}

	public int getSSN() {
		return SSN;
	}
	
	public int getSalary() {
		return salary;
	}

	public void readInput()
	{
		SSN = 000000000;
		salary = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter employee SSN (9 digits no spaces or dashes)");

//SSN	Length check
		while(SSN < 0)
			{//try again
			System.out.println("SSN has 9 digits no spaces or dashes");
			SSN = keyboard.nextInt();
						
			}
		System.out.println("You entered: " + SSN);
		
		System.out.println("Enter a positive integer for the salary (can't be negative and no commas)");
		salary = keyboard.nextInt();
//Salary check
		while(salary <= 0)
			{//try again
			System.out.println("Enter a positive integer for the salary (can't be negative and no commas)");
			salary = keyboard.nextInt();
			}		
		System.out.println("You entered: " + salary);
		
		//doSomething(SSN, salary);
	}
	

	public void writeOutput() {
		super.writeOutput();
		System.out.println("SSN is: " + SSN);
		System.out.println("Salary is: " + salary);
	}
	
	public boolean equals(EmployeeEH thatEmployee) {
		return this.hasSameName(thatEmployee) && 
				this.SSN == thatEmployee.SSN &&
						this.salary == thatEmployee.salary;
	}
}
