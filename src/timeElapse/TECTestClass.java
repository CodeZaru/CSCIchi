
public class TECTestClass {

	public static void main(String[] args) {
		
		//Test1		
		testTimeElapseCalculator();


	}

	public static void testTimeElapseCalculator() {
		TimeElapseCalculator testTEC = new TimeElapseCalculator();
		int testTECResult = testTEC.stringToIntTimeConverter("test");
		System.out.println("testTECResult: " + testTECResult);
	}
	
	
}
