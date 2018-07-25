package personHW;

public class Student extends Person {
	private int studentNumber;

	public Student() { 
		super(); //KS Note: this executes the default person constructor
		studentNumber = 0; //Indicating no number yet 
	} 
	public Student(String initialName, int initialStudentNumber) 
	{
		super(initialName); //KS Note: You have to know the parent constructors..
		studentNumber = initialStudentNumber; 
		} 

	//KS Note: for constructors we use super(), but for other methods
	//like set, we just call the set method in parent class as if it were
	//in this class.  The rest is set as usual
	//reset wasn't in parent, but since it is comprehensive/cumulative reset is a good name
	public void reset(String newName, int newStudentNumber) 
	{ 
		setName(newName);//important to note that Student has no setName method, this is a direct call to parent's method
		studentNumber = newStudentNumber; 
		} 
	//getters and setters for this class' variables only
	public int getStudentNumber() 
	{ 
		return studentNumber; 
		} 
	public void setStudentNumber(int newStudentNumber) 
	{ 
		studentNumber = newStudentNumber; 
		} 
	//KS Note: note that we use the getName method instead of using the variable
	//because the variable is private to its class and outside the class we
	//can only access it via a public getter/setter method.
	public void writeOutput() {
		System.out.println("Name: " + getName()); 
		System.out.println("Student Number: " + studentNumber); 
		} 
	//key here is defining a hasSameName type method in the parent and current class...
	//also note that the equals method doffers by data type.
	public boolean equals(Student otherStudent) 
	{ 
		return this.hasSameName(otherStudent) && (this.studentNumber == otherStudent.studentNumber); 
		} 
	}
