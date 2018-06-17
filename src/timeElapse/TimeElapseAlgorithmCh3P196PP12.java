
public class TimeElapseAlgorithmCh3P196PP12 {
	/*
	 * Chapter3 Page 196 Programming Problem 12:
	 * "Write a program that inputs two strings 
	 * that represents a time of day using the 
	 * format HH:MM:SS AM or PM and then outputs the time
	 * elapsed from the first to the second time in minutes 
	 * and seconds.
	 * 
	 * 11:58:10 PM
	 * 12:02:15 AM
	 * 
	 * The program should output that the time elapsed is 4 minutes
	 *  and 5 seconds." 
	 * 
	 *  KS Notes: 
	 *  Input as start time and end time via JOptionPane with colon separators.
	 *  Prompt separately for AM vs PM.
	 *  The actual problem is a "difference" problem, so convert to common metric (like seconds)
	 *  and compare the two amounts.  
	 *  The simplest way is to compare each amount from a common starting point, like 00:00:00,
	 *  then subtract start time from end time which results in a delta.
	 *  that delta should be converted back to hours, minutes, seconds (easily done by a std conversion method).
	 *  If end time is AM and start time is PM then it is the next day.
	 *  AM then PM (is start time is PM then need to account for that scenario)
	 *  Prompt for detail about days calc logic (using JOptionPane)
	 *  Start time is assumed to be day 1, End time is:
	 *  1) if less than start time then next day, then special calc to factor partial next day not over 24 hrs
	 *  2) if more than start time but both are same AM or PM then simple
	 *  3) if same scenario as above but AM and PM are different, then special threshold math
	 *  Reiterate Note: basically do the math to the 12hrs, so if one is before noon then calc to noon
	 *  and then calc the other from noon and add.  If both before or after noon then calc
	 *  them from noon and then subtract the start time from the end time and do conversions.
	 *  so what is the math... always from 0 to 12 
	 *  The starting point is always the beginning of the day 
	 *  (12:05:00 AM = (0*min/hr*sec/min) plus (5*sec/min) plus (0 seconds)) or 300seconds
	 *  (01:05:00 AM = (1*min/hr*sec/min) plus (5*sec/min) plus (0 seconds)) or 3,900
	 *  the answer is the difference between the two: 3,900-300=3,600 seconds or 1 hr
	 *  If you have seconds, need to do a modulus conversion technique to get hrs minutes and seconds.
	 *  if boolean test end time earlier AM than start time evaluates to TRUE then special next day calc 
	 *  if above Boolean test NOT TRUE and&& end time is PM then special calc for hours to addcorrectly.
	 *  
	 *  When prompt the user for whether time is the next day and have another special calc  
	 *  just add 24 hours to the time for one day out and two days out and three days out 
	 *  but if the end point is a lesser value AM or PM and multiple days out then special calc applies.
	 *  Also assumes that the start time is today in every case...
	 *  
	 *  should be easy to code...
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//test change
		System.out.println("test");
	}

}
