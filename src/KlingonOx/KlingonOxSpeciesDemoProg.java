
public class KlingonOxSpeciesDemoProg {

	public static void main(String[] args) {

		Species testKOSpecies = new Species("KlingonOx", 100, 15.00);
		testKOSpecies.writeOutput();

		int yearParam = 1;
		int predictedKOPopulation = testKOSpecies.predictPopulation(yearParam);
		System.out.println("The predicted KlingonOx population is " + predictedKOPopulation + " after " + yearParam + " years.");
		double areaParam = 1500;
		double predictedKODensity = testKOSpecies.getDensity(areaParam);
		System.out.println("The predicted KlingonOx population density is " + predictedKODensity + " per " + areaParam + " square miles.");
	
		while (predictedKODensity<1) {
			yearParam ++;
			predictedKOPopulation = testKOSpecies.predictPopulation(yearParam);
			testKOSpecies.setPopulation(predictedKOPopulation);
			System.out.println("The predicted KlingonOx population is " + predictedKOPopulation + " after " + yearParam + " years.");
			
			predictedKODensity = testKOSpecies.getDensity(areaParam);
			System.out.println("The predicted KlingonOx population density is " + predictedKODensity + " per " + areaParam + " square miles.");		
		}
	
	}

}
