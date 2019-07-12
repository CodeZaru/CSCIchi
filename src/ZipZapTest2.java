
public class ZipZapTest2 {

	public static String zipZap2(String str) {
		
			  String zVowelPealedString = "";
			  int subStringParamLength = 0;				
			  char startCode = 'z';
			  char stopCode = 'p';
			  
			  
			  for (int i = 0; i < str.length(); i++) { 
		
			    zVowelPealedString += str.substring(i,i+1);
			    
			    subStringParamLength = zVowelPealedString.length();
			   			    
			    if (i > 0 && i < str.length()) {

			      if (str.charAt(i-1) == startCode && str.charAt(i+1) == stopCode)
			    	  													
			    	  zVowelPealedString = zVowelPealedString.substring(0,subStringParamLength-1);

			      System.out.println(zVowelPealedString);
			    }
		
			  }
		
			  return zVowelPealedString;
		
			}
	
	public static void main(String[] args) {
		System.out.print(zipZap2("izipQzap"));

	}

}
