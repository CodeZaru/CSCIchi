
public class TemperatureArray {
	
	public static void main(String [] args) {

		double [] temperature = new double[7];
		//double total = temperature[0];
		double total = 0;
		temperature[0] = 80.0;
		temperature[1] = 81.0;
		temperature[2] = 78;
		temperature[3] = 76;
		temperature[4] = 79;
		temperature[5] = 80;
		temperature[6] = 99;

/*
		for (int index = 1; index < temperature.length; index++) {
			 total = total + temperature[index]; 
		}
*/		
		for (int index = 0; index < temperature.length; index++) {
			 total += temperature[index]; 
		}

	System.out.println("Average temperature is " + total/temperature.length);
		
	}

}
