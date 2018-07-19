
public class Person3 {
	private String name; 
	public Person3() { 
		name = "No name yet"; 
		} 
	
	public Person3(String initialName) { 
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
	
	public boolean hasSameName(Person3 otherPerson) { 
		return this.name.equalsIgnoreCase(otherPerson.name); 
		} 
	
}
