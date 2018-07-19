
public class Person3Demo {

	public static void main(String[] args) {
		
//		Person3 me = new Person3("Me");
//		Student John = new Student("A012345", "Jane");
		Student [] CSC201 = new Student[3];//you could make this an array of person and it wil still work even though you are putting students into array of person  this is polymorphism.
		
		CSC201[0] = new Student();
		CSC201[1] = new Student("A0123");
		CSC201[2] = new Student ("A0124", "John");
		
		for (int i = 0; i < CSC201.length; i++) {
			System.out.println(CSC201[i].getName());//each index refers to one student object
		//so it isn't object John or object me
		    System.out.println(CSC201[i].getStudentID() + "\t" + CSC201[i].getName());
		}
		System.out.println();
		    for (Student s : CSC201) {//for each element in array "CSC201"
		    	System.out.println(s.getStudentID() + "\t" + s.getName());   
		}
		
		
//		System.out.println(me.getName());
//		System.out.println(John.getName());
//		System.out.println(John.getStudentID());

		
		
	}

}
