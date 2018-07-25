package personHW;

public class Undergraduate extends Student {
	private int level; // 1 for freshman, 2 for sophomore
						// 3 for junior, or 4 for senior.

	public Undergraduate() 
		{ 
		//KS Note: again note that we add the super defaults
			super(); 
			level = 1; //simply choose a default value
		}

	public Undergraduate(String initialName, int initialStudentNumber, int initialLevel) 
	{ 
		//KS Note: now we pass all ancestral variables on up the line via super..
		super(initialName, initialStudentNumber); 
		setLevel(initialLevel); 
		//checks 1 <= initialLevel <= 4
		//could skip the validation and just have the line below to be simple
		//this.level = level;
		}
	//KS Note: even though this doesn't make too much sense b/c if you don't have a name or id then you don't exist
	Undergraduate(int level){
		super();
		this.level = level;
	}
//KS Note: important to note that "reset" is the same method name that we have in student but overloaded
//this is a set method for all instance variables up thru ancestors.
//Note: calls parent's reset method directly (we know this b/c signature is parent's) and adds set level.
//again: well named b/c is cumulative and comprehensive setting of value assignments to variables.
	public void reset(String newName, int newStudentNumber, int newLevel) 
	{
		reset(newName, newStudentNumber);// Student's reset
		setLevel(newLevel); // Checks 1 <= newLevel <= 4
	}
//KS Note: The strategy with al the getters and setters is that I want to develop the ability 
//to manipulate/access all the instance variables at each level in the inheritance chain (and individual classes like this one)
	public int getLevel() 
	{
		return level;
	}

	public void setLevel(int newLevel) 
	{
		//KS Note: easy boolean validation on the set method.
		if ((1 <= newLevel) && (newLevel <= 4))
			level = newLevel;
		else {
			System.out.println("Illegal level!");
			System.exit(0);
		}
	}

	public void writeOutput() 
	{
		//KS Note: "super.method" syntax differs from the constructor, b/c it seems that 
		//we already have an object and just using dot notation to access its methods
		//whereas the constructor we have special notation super(w/ or w/o args), 
		super.writeOutput();
		System.out.println("StudentLevel: " + level);//add the new variables not in its ancestors.
	}

	public boolean equals(Undergraduate otherUndergraduate) 
	{ 
		//KS Note:  cast the object as a student and pass it to the 
		//equals method selected by the one that has the student signature..
		return equals ((Student) otherUndergraduate) && (this.level == otherUndergraduate.level); 
	}
}

