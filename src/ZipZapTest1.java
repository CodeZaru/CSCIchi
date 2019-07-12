
public class ZipZapTest1 {

	public static String zipZap(String str) {
		
			  int len = str.length();
		
			  String finalString = "";
				
			
			  for (int i = 0; i < len; i++) { //this for loop includes one outside bounds
		
			    finalString += str.substring(i,i+1);//gets one letter and takes first b/c it can't be between z and p
		
			    if (i > 0 && i < len-1) {//then tests bounds with index greater than 0
//			     if (str.charAt(i-1) != 'z')
			      if (str.charAt(i-1) == 'z' && str.charAt(i+1) == 'p')//index is one past z and a p follows
			    	  												//execute code below.	
			        finalString = finalString.substring(0,finalString.length()-1);//set final string to substring 
			        //the line above peals out the vowel between z and p.
			      //it is 2 chars at this point so 0 and length minus 1 only grabs the first char
			      System.out.println(finalString);
			    }
		
			  }
		
			  return finalString;
		
			}
	
	public static void main(String[] args) {
		System.out.print(zipZap("izipQzap"));

	}

}
