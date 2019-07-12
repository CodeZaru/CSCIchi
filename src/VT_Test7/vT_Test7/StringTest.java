package vT_Test7;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String greeting = "What up!";
		String greeting2 = greeting;
		String greeting3 = "What up?";
		
		System.out.println("Test1");
		System.out.println(greeting);
		System.out.println(greeting2);
		System.out.println(greeting3);
		
		String greeting2v2 = greeting2.toUpperCase();
		String greeting3v2 = greeting3.toUpperCase();
		
		System.out.println();
		System.out.println("Test2");
		System.out.println(greeting);
		System.out.println(greeting2v2);
		System.out.println(greeting3);
	}

}
