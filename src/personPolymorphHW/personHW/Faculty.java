package personHW;

public class Faculty extends Employee {
	
	private String title;
	
	Faculty (){
		super();
		title = "No Title Yet";
	}

	Faculty (String initName, int initEmpID, String initDept, String initTitle){
		super(initName, initEmpID, initDept);
		title = initTitle;
	}
	
	public void reset (String newName, int newEmpID, String newDept, String newTitle) {
		
		reset(newName, newEmpID, newDept);
		title = newTitle;
	}
	
	public void setTitle(String newTitle) {
		title = newTitle;
	}
	
	public String getTitle() {
		return title;
	}

	public void writeOutput() {
		super.writeOutput();//accessing ancestral methods..
		System.out.println("Title: " + title);
	}
	//KS Note: this returns boolean test so make sure to specify boolean
	public boolean equals(Faculty thatFaculty) {
		return equals((Employee) thatFaculty) && this.title.equalsIgnoreCase(thatFaculty.title);
	}
	
}
