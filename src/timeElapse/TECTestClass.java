
public class TECTestClass {

	public static void main(String[] args) {
		
		//Test1		
		teststringToIntTimeConverterAndDeltaCalc();
		//Test2
		//testTimeElapseCalulatorUI();
		//Test3
		//testTimeStringValidation();

	}

	public static void teststringToIntTimeConverterAndDeltaCalc() {
		TimeElapseCalculator testTEC = new TimeElapseCalculator();
		String testStartAndEndTime = "11:58:10:pm12:02:15:am";
		testTEC.stringToIntTimeConverterAndDeltaCalc(testStartAndEndTime);
		//int testTECResult = 
		//System.out.println("testTECResult: " + testTECResult);
	}

	public static void testTimeElapseCalulatorUI() {
		TimeElapseCalculator testTECUI = new TimeElapseCalculator();
		String testTECUIResult = testTECUI.timeElapseCalulatorUI();
		System.out.println("testTECUIResult: " + testTECUIResult);
	}
	
	public static void testTimeStringValidation() {
		TimeElapseCalculator testTECValidation = new TimeElapseCalculator();
		//boolean testTECValidationResult = testTECValidation.timeStringValidation("02:03:05:AM");
		boolean testTECValidationResult = testTECValidation.timeStringValidation("13:03:05:AM");
		System.out.println("testTECValidationResult: " + testTECValidationResult);
	}
	
	
	
	
}
