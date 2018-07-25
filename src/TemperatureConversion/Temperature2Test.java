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
//TEST-2
		if (new Temperature2(100f).getCelsius() == 100 && new Temperature2(100f).getFahrenheit() == 212)
		{
			grade += 5;
			System.out.println("TEST-2: Temerature() constructor test PASSED! cumul grade: " + grade);
		}
		else
			System.out.println("Temerature(temperature) constructor test failed.");
//TEST-3
		if (new Temperature2('c').getCelsius() == 0f && new Temperature2('f').getCelsius() == -17.78f)
		{
			grade += 5;
			System.out.println("TEST-3: Temerature() constructor test PASSED! cumul grade: " + grade);
		}
		else
			System.out.println("Temerature(scale1) constructor test failed.");
//TEST-4
		if (new Temperature2(100f, 'c').getCelsius() == 100.0f && new Temperature2(32f, 'f').getCelsius() == 0f)
		{
			grade += 5;
			System.out.println("TEST-4: Temerature() constructor test PASSED! cumul grade: " + grade);
		}
		else
			System.out.println("Temerature(scale2) constructor test failed.");

		Temperature2 t1 = new Temperature2();// kitchen in class
		Temperature2 t2 = new Temperature2();// kitchen in class
//TEST-5
		t1.setDegrees(24f);
		if (t1.getCelsius() == 24f && new Temperature2(32f, 'f').getCelsius() == 0f)
		{
			grade += 5;
			System.out.println("TEST-5: Temerature() constructor test PASSED! cumul grade: " + grade);
		}	
		else
			System.out.println("Temerature(scale3) constructor test failed.");

//TEST-6
		t1.setDegreesAndScale(80f, 'F');
		//t2.setDegreesAndScale(20f, 'C');		
		if ((int)t1.getCelsius() == (int)26f && new Temperature2(20f, 'c').getFahrenheit() == 68f)
		{
			grade += 5;
			System.out.println("TEST-6: Temerature() constructor test PASSED! cumul grade: " + grade);
		}	
		else
			System.out.println("TEST-6: Temerature(temperature, scale) constructor test failed.");
//TEST-7		
		t1.setDegreesAndScale(104f, 'F');
		t2.setDegreesAndScale(20f, 'C');		
System.out.println("t1: " + t1.getCelsius() + " t2: " + t2.getCelsius());
System.out.println(t1.isGreater(t2));
		if (t1.isGreater(t2))
		{
			grade += 5;
			System.out.println("TEST-7: Temerature() t1.isGreater(t2) test PASSED! cumul grade: " + grade);
		}	
		else
			System.out.println("\"TEST-7: Temerature(scale3) constructor test failed.");
//TEST-8		
		
		t1.setDegreesAndScale(32f, 'F');
		t2.setDegreesAndScale(0f, 'C');
		System.out.println("t2: " + t2.getCelsius() + " t1: " + t1.getFahrenheit());
		System.out.println(t2.isSame(t1));
		if (t2.isSame(t1))
		{
			grade += 5;
			System.out.println("TEST-8: 	Temerature() t2.isSame(t1)  test PASSED! cumul grade: " + grade);
		}	
		else
			System.out.println("TEST-8: Temerature(scale3) constructor test failed.");
//TEST-9
		t1.setDegreesAndScale(104f, 'F');
		t2.setDegreesAndScale(20f, 'C');		
System.out.println("t1: " + t1.getCelsius() + " t2: " + t2.getCelsius());
System.out.println(t2.isLess(t1));

		if (t2.isLess(t1))
		{
			grade += 5;
			System.out.println("TEST-9: 	Temerature() t2.isLess(t1)  test PASSED! cumul grade: " + grade);
		}	
		else
			System.out.println("TEST-9: Temerature(scale3) constructor test failed.");
//TEST-10
		t1.setDegrees(24f);
		System.out.println(t1);
		String t3 = "24.0C";
		
		System.out.println("t3: " + t3 + " vs t1: " + t1.toString());
		System.out.println("boolean: " + "24.0C".equalsIgnoreCase(t1.toString()));
		System.out.println("boolean: " + t1.toString().equalsIgnoreCase(t1.toString()));

		if (t1.toString() != null)
		{
			grade += 5;
			System.out.println("TEST-10: Temerature() constructor test PASSED! cumul grade: " + grade);
		}	
		else
			System.out.println("TEST-10:  Temerature(scale3) constructor test failed.");
		
//TEST-11
		t1.setDegrees(24f);//logically doing this should reault in ftored value as F and coversions reversed..
		t1.setDegrees('F');//flow: converts stored degree to F but then reverts scale C keeping degree of F
		System.out.println("TEST-11: " + t1.toString());
		System.out.println("TEST-11: C = " + t1.getCelsius());
		System.out.println("TEST-11: F = " + t1.getFahrenheit());
		if (t1.getCelsius() == 24f && t1.getFahrenheit() == 70f)// 
		{
			grade += 5;
			System.out.println("TEST-11: Temerature() constructor test PASSED! cumul grade: " + grade);
		}	
		else
			System.out.println("TEST-11: Temerature(scale3) constructor test failed.");

		
		
		
		// NOTE: to comment out everything: highlight ctrl forward slash
		
		  System.out.printf("Your grade is %d/50.\n", grade);

	}
}
