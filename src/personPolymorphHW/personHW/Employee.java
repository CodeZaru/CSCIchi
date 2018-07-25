package personHW;

public class Employee extends Person {
	
	private int employeeID;
	private String department;
	
	Employee(){
		super();
		employeeID = 9999999;
		department = "Dept XYZ";
	}
	
	Employee(String initName, int initEmpID, String initDept){
		super(initName);
		employeeID = initEmpID;
		department = initDept;
		}
	
	public void reset (String newName, int newEmpID, String newDept) {
		setName(newName);
		employeeID = newEmpID;
		department = newDept;
	}
	
	public void setEmpID (int newEmpID) {
		employeeID = newEmpID;
	}

	public void setDept (String newDept) {
		department = newDept;
	}
	
	public int getEmployeeID() {
		return employeeID;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void writeOutput() {
		super.writeOutput();
		System.out.println("EmployyID is: " + employeeID);
		System.out.println("Department is: " + department);
	}
	
	public boolean equals(Employee thatEmployee) {
		return this.hasSameName(thatEmployee) && this.employeeID == thatEmployee.employeeID && 
				this.department.equalsIgnoreCase(thatEmployee.department);
	}
}
