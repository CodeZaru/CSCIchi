package vt_coding_bat_sandbox;

public class Count7s {

	public static void main(String[] args) {

		System.out.println(count7Method(55575787));
		
	}

	public static int count7Method(int n) {

		if (n < 1) 
			{
			  System.out.println("Create Special Terminating Case");
			return 0;
			}

		  if (n % 10 == 7) 
			  {
			  System.out.println("Do we have a right-most 7: " + n + " Yay...");
			  System.out.println("Found a right-most int is a 7");
			  return 1 + count7Method(n/10);
			  }
		  else 
			  {
			  System.out.println("right-most NOT a 7: " + n + " so...");
			  System.out.println("Truncate so 10s become 1s via /10 and int behavior");
			  System.out.println("Truncated new \"n\" " + n/10);
			  System.out.println("recursively call the count7Method with new \"n\" " + n/10);
			  return count7Method(n/10);
			  }
		}
	
}
