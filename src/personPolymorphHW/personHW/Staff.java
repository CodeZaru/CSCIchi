package personHW;

public class Staff extends Employee {
	
	private int payGrade;
	
	Staff() {
		super();
		payGrade = 1;
	}
	
	Staff(String initName, int initEmpID, String initDept, int initPayGrade) {
		super(initName, initEmpID, initDept);
		payGrade = initPayGrade;
	}
	
	public void reset (String newName, int newEmpID, String newDept, int newPayGrade) {
		reset (newName, newEmpID, newDept);
		payGrade = newPayGrade;
	}
	
	public void setPayGrade(int newPayGrade) {
		if((1 >= newPayGrade) && (newPayGrade <= 20))
			payGrade = newPayGrade;
		else {
			System.out.println("illegal: payGrade must be from 1 to 20.");
			System.exit(0);			
		}			
	}
	
	public int getPayGrade() {
		return payGrade;
	}
	
	public void writeOutput() {
		super.writeOutput();
		System.out.println("payGrade: " + payGrade);
	}
	
	public boolean equals (Staff thatStaff)
	{
		//KSNote: again note the signature determining the version of equals to run
		return equals((Employee) thatStaff) && this.payGrade == thatStaff.payGrade;
	}
	
}
