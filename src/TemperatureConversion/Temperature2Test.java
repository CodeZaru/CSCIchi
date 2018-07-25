public class Temperature2Test {

	public static void main(String[] args) {
		int grade = 0;
		// when the give celcius they send it right to the top for the
		// setter to the instance variable,
		// but if it is
//TEST-1
		if (new Temperature2().getCelsius() == 0)
		{
			grade += 5;
			System.out.println("TEST-1: Temerature() constructor test PASSED! cumul grade: " + grade);
		}	
		else
			System.out.println("Temerature() constructor test failed.");

		if (new Temperature2(100f).getCelsius() == 100 && new Temperature2(100f).getFahrenheit() == 212)
		{
			grade += 5;
			System.out.println("TEST-2: Temerature() constructor test PASSED! cumul grade: " + grade);
		}
		else
			System.out.println("Temerature(temperature) constructor test failed.");

		if (new Temperature2('c').getCelsius() == 0f && new Temperature2('f').getCelsius() == -17.78f)
		{
			grade += 5;
			System.out.println("TEST-3: Temerature() constructor test PASSED! cumul grade: " + grade);
		}
		else
			System.out.println("Temerature(scale1) constructor test failed.");

		if (new Temperature2(100f, 'c').getCelsius() == 100.0f && new Temperature2(32f, 'f').getCelsius() == 0f)
		{
			grade += 5;
			System.out.println("TEST-4: Temerature() constructor test PASSED! cumul grade: " + grade);
		}
		else
			System.out.println("Temerature(scale2) constructor test failed.");

		Temperature2 t1 = new Temperature2();// kitchen in class
		Temperature2 t2 = new Temperature2();// kitchen in class

		t1.setDegrees(24f);
		if (t1.getCelsius() == 100.0f && new Temperature2(32f, 'f').getCelsius() == 0f)
		{
			grade += 5;
			System.out.println("TEST-5: Temerature() constructor test PASSED! cumul grade: " + grade);
		}	
		else
			System.out.println("Temerature(scale3) constructor test failed.");

		// NOTE: to comment out everything: highlight ctrl forward slash
		
		  System.out.printf("Your grade is %d/50.\n", grade);

	}
}
