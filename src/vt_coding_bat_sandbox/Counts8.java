package vt_coding_bat_sandbox;

public class Counts8 {
	
		public static void main(String[] args) {

			System.out.println(count8(555885787));
			
		}

		public static int count8(int n) 
		{

			if (n < 1) 
				{
				  System.out.println("Create Special Terminating Case");
				return 0;
				}

			  if ((n % 10 == 8) && ( (n / 10) % 10 == 8)) 
			  	{
				  System.out.println("Do we have a right-most 8: " + n + " Yay...");
				  System.out.println("Found a right-most int is a 8, check next one over");
					  return 2 + count8(n/10);  
				  	}
			  else if (n % 10 == 8)
				  {
					System.out.println("Check and Record 8: NO BONUS CASE");  
					System.out.println("*********************************************"); 
				  	System.out.println("Do we have a right-most 8: " + n + " Yay...");
					System.out.println("*********************************************"); 
					System.out.println("Found a right-most int is a 8");
				  
				  return 1 + count8(n/10);
			  	}
			  else 
				
				  System.out.println("right-most NOT a 8: " + n + " so...");
				  System.out.println("Truncate so 10s become 1s via /10 and int behavior");
				  System.out.println("Truncated new \"n\" " + n/10);
				  System.out.println("recursively call the count8 method with new \"n\" " + n/10);
				  return count8(n/10);
				
	
			}
}
	


