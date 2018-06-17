
public class TECTestClass {

	public static void main(String[] args) {
		
		//Test1		
		//testTimeElapseCalculator();
		//Test2
		//testTimeElapseCalulatorUI();
		//Test3
		testTimeStringValidation();

	}

	public static void testTimeElapseCalculator() {
		TimeElapseCalculator testTEC = new TimeElapseCalculator();
		int testTECResult = testTEC.stringToIntTimeConverter("test");
		System.out.println("testTECResult: " + testTECResult);
	}

	public static void testTimeElapseCalulatorUI() {
		TimeElapseCalculator testTECUI = new TimeElapseCalculator();
		testTECUI.timeElapseCalulatorUI();
		//System.out.println("testTECUIResult: " + testTECUIResult);
	}
	
	public static void testTimeStringValidation() {
		TimeElapseCalculator testTECValidation = new TimeElapseCalculator();
		//boolean testTECValidationResult = testTECValidation.timeStringValidation("02:03:05:AM");
		boolean testTECValidationResult = testTECValidation.timeStringValidation("13:03:05:AM");
		System.out.println("testTECValidationResult: " + testTECValidationResult);
	}
	
	
	
	
}
