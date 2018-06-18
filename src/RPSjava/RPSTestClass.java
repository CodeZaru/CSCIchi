
public class RPSTestClass {

	public static void main(String[] args) {

		//Test1		
		testRPSComputerHand();
		
	}


	public static <HandChoice> void testRPSComputerHand() {
		RPSGame testComputerHand = new RPSGame();
//		int testComputerHandResult = testComputerHand.generateComputerHand();
		RPSGame.HandChoice testComputerHandResult = testComputerHand.generateComputerHand();
		System.out.println("testComputerHandResult (note that answer differs from testGamePlay b/c that runs generateComputerHand() again): " + testComputerHandResult);
	}

}
