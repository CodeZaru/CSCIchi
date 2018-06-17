import javax.swing.JOptionPane;

public class TimeElapseCalculator {

	public static void main(String[] args) {
		String startTimeString = JOptionPane.showInputDialog("Enter the starting time in \n"
				+ "in 00:00:00:AM/PM format for hrs mins secs and AM or PM\n"
				+ "separate your hrs mins secs and AM/PM by colons not spaces");
		
		if ((startTimeString.charAt(2)==':')&& (startTimeString.charAt(5)==':') && (startTimeString.charAt(8)==':')) {
			int hrs = Integer.parseInt(startTimeString.substring(0, 2));
				if (hrs<=12) {
					System.out.println("hours are valid");
					stringToIntTimeConverter (startTimeString);
		
				}
		}
		//instead of coding immediately below, call method to that takes startTimeString param
		//and converts to String Time to seconds time metric
		//call should work the string/substring/intconversion and Parsing (i.e., int startTime = Integer.parseInt(startTimeString); 
		//when called and passed the string in correct form 
		//
		//  might use coin converter logic to do a total seconds to hr minute second conversion
		// because once we find the delta we need to convert it back.
		//we also need logic to convert to total time..
		//
	}

	
	
	public static boolean timeStringValidation (String timeString) {
		boolean validTimeString = false;
		if ((timeString.charAt(2)==':')&& (timeString.charAt(5)==':') && (timeString.charAt(8)==':')) {
			int hrs = Integer.parseInt(timeString.substring(0, 2));
			int min = Integer.parseInt(timeString.substring(3, 5));
			int sec = Integer.parseInt(timeString.substring(6, 8));
			String amPm = timeString.substring(9, 11);
				if (hrs<=12) {
					System.out.println("hours are valid: " + hrs);	
					if (min<=60) {
						System.out.println("minutes are valid: " + min);											
						if (sec<=60) {
							System.out.println("seconds are valid: " + sec);
							
								//inner most nested if--start
									if(amPm.equalsIgnoreCase("AM")) { 								
										System.out.println("amPM is valid: " + amPm);
										validTimeString = true;
									}
									else if (amPm.equalsIgnoreCase("PM")) {									
										System.out.println("amPM is valid: " + amPm);
										validTimeString = true;
									}											
									else {
										System.out.println("AM/PM are invalid: " + amPm);
									}
								//inner most nested if--start

						}
						else 
							System.out.println("seconds are invalid: " + sec);
					}
					else 
						System.out.println("hours are invalid: " + min);
				}	
				else
					System.out.println("hours are invalid: " + hrs);
		}
					
		return validTimeString;
	}

	//stringToIntTimeConverter (timeString);	
	
	public static void timeElapseCalulatorUI() {
		String startTimeString = JOptionPane.showInputDialog("Enter the starting time in \n"
				+ "in 00:00:00:AM/PM format for hrs mins secs and AM or PM\n"
				+ "separate your hrs mins secs and AM/PM by colons not spaces");
		
	}
	
	public static int stringToIntTimeConverter (String timeString) {
//		int timeInt = 0;
//		if ((timeString.charAt(2)==':')) {
			int timeInt = 555; 
			System.out.println("timeInt: " + timeInt);			
//		}
		return timeInt;	
		
		
		// && (timeString.charAt(5)) && (timeString.charAt(8))
		//Do variable declarations string parsed to subsring and conversions
		

	}
	
}
