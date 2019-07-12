package vt_coding_bat_sandbox;

public class ChangePi {

	public static void main(String[] args) {

		System.out.println(changePi("hi pi or Brazillianpi"));

	}

	public static String changePi(String str) 
	{
		  if (str.length() < 2) 
//		if (str.equals("") || str.length() < 2)

			  {
			  System.out.println("Create Special Terminating Case");
			  return str;
			  }
		  
		  if (str.charAt(0) == 'p' && str.charAt(1) == 'i') 
		    {
			  
			  System.out.println("Case: we HAVE a 'p' and 'i' in the string @ these indexes");
//			  System.out.println("chill b/c str.charAt(0) is: " + str.charAt(0));
//			  System.out.println("chill b/c str.charAt(1) is: " + str.charAt(1));
			  System.out.println("So swap the \"pi\" for a \"3.14\", and crawl up the string's index by two");
//			  System.out.println("chill b/c str.charAt(2) is: " + str.charAt(2));
			  System.out.println("recursive call to changePi and pass in substring staring at new index");

			  return "3.14" + changePi(str.substring(2));
		    }
		  else
		  {
			  System.out.println("Case: we DON'T a 'p' and 'i' in the string @ these indexes");
//			  System.out.println("chill b/c str.charAt(0) is and remains: " + str.charAt(0));
//			  System.out.println("chill b/c str.charAt(1) is and remains: " + str.charAt(1));
			  System.out.println("Crawl up the string's index by one to continue the search");
			  System.out.println("recursive call to changePi and pass in substring staring at new index");
		  return str.charAt(0) + changePi(str.substring(1));
		  }

//		public String changePi(String str) {
//			  if (str.equals("") || str.length() < 2) return str;
//			  if (str.charAt(0) == 'p' && str.charAt(1) == 'i') 
//			    return "3.14" + changePi(str.substring(2));
//			  return str.charAt(0) + changePi(str.substring(1));
//			}
	}
//	
}
