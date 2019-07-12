package vt_coding_bat_sandbox;

public class ChangeXY {

	public static void main(String[] args) {

		System.out.println(changeXY("extacy"));

	}

	public static String changeXY(String str) {
		  if (str.equals("")) 
			  {
			  System.out.println("Create Special Terminating Case");
			  return str;
			  }
		  
		  if (str.charAt(0) == 'x') 
			  {
			  System.out.println("Case: we HAVE an \"x\" in the string @ this index");
			  System.out.println("So swap the \"x\" for a \"y\", and crawl up the string's index by one");
			  System.out.println("recursive call to changeXY and pass in substring staring at new index");

			  return "y" + changeXY(str.substring(1));
			  }
		  System.out.println("Case: we DON'T have an \"x\" in the string @ this index");
		  System.out.println("chill b/c str.charAt(0) is and remains: " + str.charAt(0));
		  return str.charAt(0) + changeXY(str.substring(1));
		}
	
}
