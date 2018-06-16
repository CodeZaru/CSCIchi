
public class RPSTestClass {

	public static void main(String[] args) {

		//Test1		
		testRPSComputerHand();
		//Test2
		testGamePlay();

		
	}


	public static <HandChoice> void testRPSComputerHand() {
		RPSGame testComputerHand = new RPSGame();
//		int testComputerHandResult = testComputerHand.generateComputerHand();
		RPSGame.HandChoice testComputerHandResult = testComputerHand.generateComputerHand();
		System.out.println("testComputerHandResult (note that answer differs from testGamePlay b/c that runs generateComputerHand() again): " + testComputerHandResult);
	}
	
	public static void testGamePlay() {
		RPSGame testGamePlay = new RPSGame();
		String testGamePlayResult = testGamePlay.gamePlay();
		System.out.println("testGamePlayResult: " + testGamePlayResult);
	}
	
}
