import javax.swing.JOptionPane;

public class EdocCalculator {

	public static void main(String[] args) {
		
		expPtsCalcUI();

	}

	public static void expPtsCalcUI() {
		int expCalcDataInt;
		String expCalcData = JOptionPane.showInputDialog(
				"ENTER the NUMBER OF EDOCS you've caught\n" + "and the NUMBER OF EDOC CANDIES you have.\n"
						+ "DATA ENTRY FORMAT: USE COLONS to separate data, not spaces. \n" + "i.e. 100:55");

		if (!(edocDataInputValidation(expCalcData))) {
			JOptionPane.showMessageDialog(null, "Your DATA ENTRY was INVALID FORMAT");
			System.exit(0);
		} // could re-prompt if have time to code (like Try again: Yes or No)


	stringToIntConverAndExCalc(expCalcData);
		
	//	return expCalcDataInt;
	
	}

	public static int stringToIntConverAndExCalc(String inputData) {
		// find Colon Starting from (startIndex + 3),currIndex
		int colonIndex = inputData.indexOf(":");

		String edocInputDataString = inputData.substring(0, colonIndex);
		String edocCandyInputDataString = inputData.substring(colonIndex + 1);
		System.out.println("edocInputDataString: " + edocInputDataString);
		System.out.println("edocCandyInputDataString: " + edocCandyInputDataString);

		int edocCount = Integer.parseInt(edocInputDataString);
		System.out.println("edocIntCount: " + edocCount);

		int edocCandyCount = Integer.parseInt(edocCandyInputDataString);
		System.out.println("edocCandyIntCount: " + edocCandyCount);

		int margorpCount = 0;

		int experiencePts = 0;


		while (edocCandyCount >= 12) {
			// perform evolution
			edocCandyCount -= 12;
			edocCount--;
			margorpCount++;
			experiencePts += 500;
			edocCandyCount++;

			// perform Transfer Margorp
			edocCandyCount++;
			margorpCount--;

			if ((edocCandyCount < 12))

				while ((edocCandyCount < 12) && (edocCount > 0)) {
					edocCount--;
					edocCandyCount++;

				}

		}

		System.out.printf("Edoc:  %d \n", edocCount);
		System.out.printf("Margorp:  %d \n", margorpCount);
		System.out.printf("Candy:  %d \n", edocCandyCount);
		System.out.printf("Experience Points:  %d \n", experiencePts);
		return experiencePts;

	}
	
	public static boolean edocDataInputValidation(String dataInputString) {
		boolean validEdocDataString = false;
		if (!(dataInputString.indexOf(":") == -1)) {
			validEdocDataString = true;
		}
		
		return validEdocDataString;
	}
}

/*
 * You have an augmented reality game: catch Edoc, get Candy, and Evolve/Trade.
 * 
 * point system: Costs 12 candies to evolve Edoc to Margorp. Each evolution
 * earns you 1 Candy back. Each evolution also earns you 500 Exp Pts. ?An Edoc
 * or Margorp can be transferred for one Edoc Candy.
 * 
 * The challenge and Inputs: Challenge- write an Edoc Calculator program that
 * takes inputs Input: the number of Edoc you have caught. Input: the number of
 * Edoc Candies in your possession. Input Assumption: number of Margorps is 0
 * for calc.
 * 
 * The Output: The maximum number of Exp pts you can earn through transfers and
 * evolutions.
 * 
 * One more thing: After Edocs evolve to Margorps your program should consider
 * if transferring the Margorps will result in enough candy to evolve even more
 * Edoc (so how many twelves of Margorps do you have)
 * 
 * The Final Answer should always be the MAX possible Exp Pts
 * 
 * 
 */
