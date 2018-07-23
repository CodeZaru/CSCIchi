//OOP

import java.util.Scanner;
public class PersonDemoOrig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person john = new Person();
		Person jane = new Person("Jane Doe", 23);
		Person jack = new Person("Jack Doe", 15);
		
		Scanner keyboard = new Scanner(System.in);

		//if the name was public not private, I could update the name
		//john.name = "Jerry Doe";

	//	john.setName("JJ");
		john.setAge(35);
		System.out.println(john.getName());
		System.out.println(john.getAge());;
	
		System.out.println(jane.getName());
		System.out.println(jane.getAge());;

		//p371 prob 2
		if (john.isSameAge(jane))
			System.out.println("Same age");
		else
			System.out.println("Different age");
		
		if (john.isSameName(jane))
			System.out.println("Same name");
		else
			System.out.println("Different name");
		
		if (john.isSamePerson(jane))
			System.out.println("Same person");
		else
			System.out.println("Different person");
		    System.out.println(john.isSamePerson(jane));
		
	}

}
