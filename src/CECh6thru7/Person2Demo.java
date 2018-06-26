
public class Person2Demo {
//page 467, 468
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2 t = new Person2();
		t.setAge(2);
		
		Person2 tod = Person2.createToddler();//can do this b/c it is a static method
		Person2 patty = Person2.createToddler();//can do this b/c it is a static method
		Person2 andy = Person2.createToddler();//can do this b/c it is a static method
				
		if (!tod.isSameAge(patty))
			System.out.println("not the same person");
			System.out.println(tod.getName());
	}

}
