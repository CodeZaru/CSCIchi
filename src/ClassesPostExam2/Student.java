//inheritance
public class Student extends Person3{

	private String studentID;
	
		Student()
		{			
		//super(); is implicit here and it reaches the immediate parent
		}

		Student(String studentID) {
			this.studentID = studentID;
		}

		Student(String studentID, String name) {
			this.studentID = studentID;
			super.setName(name);//because there is no set name locally, you don't have to write the "super." just "setName"
			//if there was a local version of setName you'd have to specify to get to the parents version of the name.
			//student doesn't have name, so this is setting name property in the super class.
		}
						
		public void setStudentID(String studentID) {
			this.studentID = studentID;
		}
		
		public String getStudentID() {
			return this.studentID;
		}
		
		public String getName() {
			return "Student's name is: " + super.getName();
		}
		
	}
	
	
	
	

