package personHW;

public class PersonPolymorphDemo2 {

	public static void main(String[] args) {
		
		Person [] people = new Person[7];
		
		people[0] = new Faculty("Jack",1,"DeptA","Prof of CS");
		people[1] = new Student("Jill",1);
		people[2] = new Staff("John",2,"DeptB",10);
		people[3] = new Staff("Joe",3,"DeptE",20);
		people[4] = new Undergraduate("Jane",2,2);
		people[5] = new Employee("Jim",4,"DeptH");
		people[6] = new Undergraduate("Jan",7,3);
		
		for(Person p : people) {
			p.writeOutput();
			System.out.println();
		}
		
		

	}

}
