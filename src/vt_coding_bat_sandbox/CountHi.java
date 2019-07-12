package vt_coding_bat_sandbox;

public class CountHi {

	public static void main(String[] args) {
		
		System.out.println(countHi("hiho hiho and of to ho hi"));

	}

	public static int countHi(String str) {
		  if (str.length() < 2)
			  {
			  System.out.println("Create Special Terminating Case");
			  return 0;
			  }
		  if (str.substring(0,2).equals("hi"))
			  {
			  System.out.println("Case: we HAVE a \"hi\" in the string");
			  System.out.println("So rack up a count, and crawl up the string's index by one");
			  System.out.println("recursive call to countHi and pass in substring staring at new index");
			  return 1 + countHi(str.substring(1));
			  }
		  else
			  {
			  System.out.println("Case: we DON'T have a \"hi\" in the string");
			  System.out.println("Crawl up the string's index by one");
			  System.out.println("recursive call to countHi and pass in substring staring at new index");
			  return countHi(str.substring(1));
			  }
		}
	
}
