package personHW;
public class Person {
	
	private String name;
//KS Note: set name equal to a default value
	public Person() {
		name = "No name yet";
	}

	public Person(String initialName) {
		name = initialName;
	}

	public void setName(String newName) {
		name = newName;
	}

	public String getName() {
		return name;
	}

	public void writeOutput() {
		System.out.println("Name: " + name);
	}
//KS Note:  this is a boolean test..
	public boolean hasSameName(Person otherPerson) {
		//KS Note: be clear and specify this. vs that. type syntax
		return this.name.equalsIgnoreCase(otherPerson.name);
	}
}