
public class EdocCalcTestClass {

	public static void main(String[] args) {
		// Test1
		testEdocCalculator();
		
		//Test2
		testExpPtsCalcUI();		
	}

	public static void testEdocCalculator() {
		EdocCalculator testEdocCalc = new EdocCalculator();
		String edocCalcTestData = "200:200";		
		int testEdocCalcResult = testEdocCalc.stringToIntConverAndExCalc(edocCalcTestData);
		System.out.println("testEdocCalcResult Experience Points: " + testEdocCalcResult);
	}

	public static void testExpPtsCalcUI() {
		EdocCalculator testExpPtsCalcUI = new EdocCalculator();
		testExpPtsCalcUI.expPtsCalcUI();
}

}