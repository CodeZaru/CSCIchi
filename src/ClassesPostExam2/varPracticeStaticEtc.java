/**
 * Notes on static methods and the main method.  
 * NOTE ABOUT NOTES: i USE ALL CAPS FOR EMPHASIS, BUT THE ACTUAL JAVA VARIABLE/MEHTOD STUBS ARE ALL LOWER CASE.
 * 
 * p399
 * STATIC VARIABLES: are shared by all objects of a class.
 * 
 * They are declared like instance variables but with the keyword STATIC after the access modifier (public/private).
 * STATIC VARIABLES can change in value, but by using the KEYWORD FINAL you can prevent modification of static variables 
 * so that they don't change in value.  That is how we create CONSTANTS. 
 * Example1: public static final double FEET_PER_YARD = 3; 
 * Example2: private static int numberOfInvocations;
 * As you can see above, static variables can be public or private; However, like instance variables, static variables
 * that are not constants should normally be private and only modified via getter/accessor and setter/mutator methods.
 * 
 * The value of a static variable like Example 2 above, which by its static nature can be accessed by every object of the class, 
 * is that it enables those objects to to communicate with one another to perform some joint action.  For example, 
 * each method in the class could increment the "numberOfInvocations" variable and so track how many methods calls are
 * made by all objects of the class.
 * 
 * p400
 * Both Static and Non-Static variables are sometimes referred to as fields or data members.
 * 
 * Java has three kinds of variables: local variables, instance variables, and static (class) variables,
 * Class variables are shared by all objects in the class (don't confuse class-level/scope 
 * with the notion of a variable of a class-type, which is a data type like primitive is a data type) 
 * 
 * Later can also learn about static objects (as opposed to static variables and methods).. 
 * System.out is a static object.  
 * We learend in Chapter 2 "out" is an OBJECT of the class System (but it is actually a static constant declared as in the above example.
 * Since "out" is public, we can access it by name from outside the class System. However, when we do so, we must
 * we must precede its name with the class name and a dot, hence: "System.out"
 * PrintStream Example of its declaration: public static final PrintStream out; 
 * The above Example creates "out" as an static constant object of PrintStream class (is this overloaded or extended) which is in the Java Class library
 * the methods print and println are methods of this class and since out is an object of the class system through some means
 * then we write Syste.out.println...
 * 
 * p400
 * Static Methods:  sometimes you need a method that has no realtion to an object of any kind. 
 * Think, for example, about the Math class and its methods..  In such cases, you define the method as static
 * When you define a static method, it is still a member of the class, 
 * but you invoke the method using the class name dot instead of an object name and dot. 
 * 
 * p402/403 Savings Account and summary notes in the code regarding static methods relationships to variables...
 * 
 * p407
 * Generally, a STATIC METHOD can invoke ONLY STATIC METHODS
 * and reference ONLY STATIC VARIABLES.  
 * It CANNOT invoke a NON-STATIC method of the same class 
 * UNLESS you have an object of the class to use in the invocation.
 * Since the method MAIN is STATIC, so you must adhere to the rules for 
 * STATIC MMETHODS 
 * 
 * p406
 * If you place the KEYWORD STATIC in the heading of the definition of a method,
 * the method can be invoked using the class name in place of an object name.
 * (note either the method stub has the STATIC KEYWORD or it does not; there is no alternative modifier).
 * Since it does NOT need an object in it's invocation,
 * a STATIC method CANNOT REFerence an INSTANCE VARIABLE of the class.
 * It also CANNOT invoke a nonStatic method of the class, UNLESS it has an object of the class
 * and uses this object in its invocation (of the method).  
 * IN OTHER WORDS, the DEFINITION of a STATIC method CANNOT USE an INSTANCE VARIABLE or 
 * a NON-STATIC METHOD that has an implicit or explicit THIS as its calling object. 
 * (GO BACK AND REVIEW "THIS" KEYWORD).---ON PAGE 290, the THIS keyword 
 * THIS: instance variables are written differently depending on whether they are written within the class definition
 * or someplace outside the class definition, such as a program that uses the class.
 * Outside the class definition, you name/call the variable via an object of the class and in dot notation.
 * for example: speciesOfTheMonth.name = "Klingon Ox";
 * However, inside the definition of a method of that same class, you can simply use the instance variable 
 * name without any object name or dot. For example, the following line occurs inside the definition 
 * of the method readInput of the class file SpeciesFirstTry  
 * p290  As you know, every instance variable, including name, is an instance variable of some object. 
 * In cases like this, the object is understood to be there, but its name usually is omitted. 
 * This understood object has the somewhat unusual name of this. Although this is frequently 
 * omitted—but understood to be there—you can include it if you want. For example, these two 
 * example assignments of the instance variable name are equivalent:
 * Ex1: name = keyboard.nextline();
 * Ex2: this.name = keyboard.nextline();
 * 
 * 
 * p302 PRECONDITION/POSTCONDITION
 * p303 PUBLIC and PRIVATE
 * 
 * the modifier PUBLICc, when applied to a class, method, or instance variable, means that 
 * any other class can directly use or access the class, method, or instance variable by name
 * So in another program/class, I can assign value to an instance variable of some object of the offending class,
 * if I use dot notation and the objects identifier/variable assigned to its name. 
 * i.e. testObject1.name/instanceVariable = haha; or a value like 5
 * However, if I use PRIVATE in the class's instance variable definition, the above value assignment is invalid and won't work.
 * Instead, I have to use a PUBLIC method to access/mutate the private instance variable (public method lit reaInput() can 
 * access and set the instance variables.  
 *  
 * Most methods are public, but if you have a method that will be used only within the definition 
 * of other methods of that class, it makes sense to make this “helping” method private. Using 
 * private methods is another way of hiding implementation details within the class.
 * 
 * Normally, all instance variables are private and most methods are public (except helper methods that also facilitate 
 * hiding tthe implementation details within the class.
 * 
 * THIS:
 * within a class definition THIS is a name for the receiving object (or caller).
 * so if speciesOfTheMonth (the receiving object) invoked/called writeOutput() 
 * then EX: speciesOfTheMonth.writeOutput() it the outside of class code, and the
 * inside class code the writeOutput() method makes references to instance variables 
 * with or without the keyword THIS..so implicitly/explicitly THIS is there in front of the instance variable names
 * and THIS (whether invisible or not) acts as a placeholder for the receiving/calling object's name..
 * so the EX above THIS in the class definition refers/is a variable of a sort for speciesOfTheMonth. 
 * 
 * p310 accessor and mutator methods.
 * 
 * WHEN WRITING CODE do sanity checks on your access modifiers public/private
 * and on your static (class level) non-static instance level calls
 * and can review caller type stuff from Duke..
 *1) If static variable: then private unless a constant with final modifier.
 *2) If non-static variable: then private (under normal circumstances)
 *3) Private variables: access/modify value using getter and setter methods (what is the rule for their access modifiers public/private).  
 *
 *
 *
 *
 */
public class varPracticeStaticEtc {
	
	//create candidate class/objects
	//create Voters
	//create inner loop and outer loop that iterates thru the 4 or so candidates and 100 voters cannidate selection is random
	//part of loop code block creates voter with an id corresponding to index + 1.
	//static/class level variables model after the bank account example..
	//voter objects that are each only allowed to vote once (boolean votedP/VP true/false)
	//

}
