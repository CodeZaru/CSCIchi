import javax.swing.JOptionPane;

public class TimeElapseCalculator {

	public static void main(String[] args) {
		
		timeElapseCalulatorUI();
		
		System.exit(0);
	}

	public static String timeElapseCalulatorUI() {
		String startAndEndTimeStrings;
		String startTimeString = JOptionPane.showInputDialog("ENTER the STARTING TIME in \n"
				+ "in 00:00:00:AM/PM format for hrs mins secs and AM or PM \n"
				+ "separate your hrs mins secs and AM/PM by colons not spaces");
		
		if (!(timeStringValidation (startTimeString))){
			JOptionPane.showMessageDialog(null, "Your START TIME was INVALID");
			System.exit(0);
		}//could re-prompt if have time to code (like Try again: Yes or No)

		String endTimeString = JOptionPane.showInputDialog("ENTER the ENDING TIME in \n"
				+ "in 00:00:00:AM/PM format for hrs mins secs and AM or PM \n"
				+ "separate your hrs mins secs and AM/PM by colons not spaces");
		
		if (!(timeStringValidation (endTimeString))){
			JOptionPane.showMessageDialog(null, "Your END TIME was INVALID");
			System.exit(0);
		}

		startAndEndTimeStrings = startTimeString + endTimeString; 
		stringToIntTimeConverterAndDeltaCalc(startAndEndTimeStrings);
		return startAndEndTimeStrings;
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


	
	public static String stringToIntTimeConverterAndDeltaCalc (String timeString) {
		String startTimeString = timeString.substring(0, 11);
		String endTimeString = timeString.substring(11, 22);		
		System.out.println("startTimeString: " + startTimeString);
		System.out.println("endTimeString: " + endTimeString);

		String startAmPm = startTimeString.substring(9, 11);
		String endAmPm = endTimeString.substring(9, 11);
		

		int startHrs = 	Integer.parseInt(startTimeString.substring(0, 2));
		System.out.println("startHrs before set to 0: " + startHrs);
		if (startHrs == 12)
			startHrs = 0;
		System.out.println("startHrs after set to 0: " + startHrs);
		System.out.println("startHrs before set to plus 12: " + startHrs);
		if (startAmPm.equalsIgnoreCase("PM"))
			startHrs = startHrs +12;
		System.out.println("startHrs after set to plus 12: " + startHrs);
		int startMin = Integer.parseInt(startTimeString.substring(3, 5));
		int startSec = Integer.parseInt(startTimeString.substring(6, 8));

		int endHrs = Integer.parseInt(endTimeString.substring(0, 2));
		System.out.println("endHrs before set to 0: " + endHrs);
		if (endHrs == 12)
			endHrs = 0;
		System.out.println("endHrs set to 0: " + endHrs);
		System.out.println("endtHrs before set to plus 12: " + endHrs);
		if (endAmPm.equalsIgnoreCase("PM"))
			endHrs = endHrs +12;
		System.out.println("endHrs after set to plus 12: " + endHrs);
		int endMin = Integer.parseInt(endTimeString.substring(3, 5));
		int endSec = Integer.parseInt(endTimeString.substring(6, 8));
		
		int startTimeInSeconds = (startHrs * 3600) + (startMin * 60) + (startSec);
		System.out.println("startTimeInSeconds: " + startTimeInSeconds);
		int endTimeInSeconds = (endHrs * 3600) + (endMin * 60) + (endSec);
		System.out.println("endTimeInSeconds: " + endTimeInSeconds);
		boolean aMpMTest = false;
		if (endTimeInSeconds < startTimeInSeconds)
		aMpMTest = true;

		if (aMpMTest) 
			endTimeInSeconds = (endTimeInSeconds + 86400); 		
		System.out.println("endTimeInSeconds after attempting to add 86400: " + endTimeInSeconds);
		int deltaTotalInSeconds = endTimeInSeconds - startTimeInSeconds; 
			
		System.out.println("deltaTotalInSeconds after attempting to add 86400: " + deltaTotalInSeconds); 
		String totalElapsedTime = deltaConverter(deltaTotalInSeconds);
		System.out.println("totalElapsedTime: " + totalElapsedTime);			

		return totalElapsedTime;	
		
	}
	
	public static String deltaConverter(int deltaSecondsTotal) {
	
	    final int MINS_IN_HOUR = 60;
	    final int SECS_IN_MINUTE = 60;

	    int deltaSeconds = deltaSecondsTotal % SECS_IN_MINUTE;
	    System.out.println("deltaSeconds: " + deltaSeconds);
	    int totalMinutes = deltaSecondsTotal / SECS_IN_MINUTE;
	    System.out.println("totalMinutes: " + totalMinutes);	    
	    int deltaMinutes = totalMinutes % MINS_IN_HOUR;
	    System.out.println("deltaMinutes: " + deltaMinutes);	    
	    int deltaHours = totalMinutes / MINS_IN_HOUR;
	    System.out.println("deltaHours: " + deltaHours);	    	    

	    return deltaHours + " hours " + deltaMinutes + " minutes " + deltaSeconds + " seconds";
	}
	
}
