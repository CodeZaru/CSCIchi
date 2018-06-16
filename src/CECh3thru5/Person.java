
//OOP
public class Person {
	//instance variables/Attributes/Properties
	private String name;
	//if you did the above line like below public instead of private
	//public String name;
	private int age;

	//Constructors are the first thing to execute
	//They are always public
	//they are the same name as the class/file.
	//Default Constructor (by default it is public)
	Person() {
		name = "John Doe";
		age = 55;
	}
	
	//Overloaded Constructor (if you give me params I'll use this constructor)
	//otherwise I'll use default
	//this refers to .. and the brown frefers to local vairable that is gone after running
	//if you get rid of the this. then java will assign null and 0..
	//if you change the signature to be String n and int a and change the righthand side to  n and a
	//in that case java would automatically use this b/c it won't confuse with the local variable.
	//full around with this to see..
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}	
	
	//Accessor methods/Get methods
public String getName() {
	return name;
}
	
public int getAge() {
	return age;
}
//Mutator method/Set Method
public void setAge(int age)
{
	if (age > 0)		
	this.age = age;
}

public void setName(String name)
{
	this.name = name;
}

public void setNameAge(String name, int age) {
	setName(name);
	setAge(age);
}

public boolean isSamePerson(Person another) {
	return (isSameAge(another) && isSameName(another));
}

public boolean isSameAge(Person another) {

	return (this.age == another.age);
/*	
	boolean result;
	if (this.age == another.age)
	result = true;
	else
		result = false;
	return result;
*/
}
public boolean isSameName(Person another) {
	return (this.name.equalsIgnoreCase(another.getName()));//could also be another.name
}

public boolean isYounger(Person another) {
	return (this.age < another.age);
}

public boolean isOlder(Person another) {
	return (this.age > another.age);
}


}
