
public class Decoder {

	public static void main(String[] args) {

		
	}

	public String secretDecoder(String secretCode) {

		String secretCodeStr = secretCode;
		StringBuffer result = new StringBuffer();
		int secretCodeCharASCIIValue;
		int decodedSecretCodeCharASCIIValue;
		char decodedSecretCodeChar;
		
		for (int i = 0; i < secretCodeStr.length(); i++) {
			char secretCodeChar = secretCodeStr.charAt(i);
			
			secretCodeCharASCIIValue = (int) secretCodeChar;//convert char to ASCII code
			
			System.out.println("secretCode: " + secretCodeChar);
			System.out.println("secretCodeCharASCIIValue: " + secretCodeCharASCIIValue);			
			int key = 10;	
		//		for (int key = 1; key <= 10; key++ ) {
					
					if (secretCodeCharASCIIValue - key < 32) {					
						decodedSecretCodeCharASCIIValue = ((secretCodeCharASCIIValue - key) + 127) -32; 
					}
					else
					{
						decodedSecretCodeCharASCIIValue = (secretCodeCharASCIIValue - key);
					}
					
				decodedSecretCodeChar = (char) decodedSecretCodeCharASCIIValue;
				result.append(decodedSecretCodeChar);			
			//	}
			
			//result.append(secretCodeChar);			
			//System.out.println("secretCodeResult: " + result);
		}

		return result.toString();
		
			//		StringBuffer result = new StringBuffer();
/*		
		for (int j = 0; j<secretCode.length(); j++) {
		char encryptedChar = secretCode.charAt(i);
		char originalChar = 0;
		int key = 0;
		if (originalChar + key > 126) {
		if (encryptedChar - key < 32)
			//they are setting enccrytedChar = to an int and converitng the int to a char
			//if original char plus the key are >126 (i.e. origChar of 126 plus any positive non-zero number
			//so 126+1 is 127 minus 127 is 0 plus 32 to get it back to the beginning of ascii which is 32.
			//the "if (guard)" created the wrap and if guard is N/A then it is straight forward...
			//so they reset or wrap to the beginning of the ascii character, and the key impacts where the reset happens
			//so really looks like there are only 94 characters thru which to iterate.
			//original loop
			//so I want to iterate the su of the origChar plus 1 thru 94 and when the sum is greater than 126 I want to wrap it
			//to the beginning. 
			//It seems like this might require nested loops. The outer one to go through each originalChar 
			// and the inner one to go through all possible key values 
			
			//encryptedChar = 32 + ((int)(originalChar + key) - 127);
			//encryptedChar - key + 127 -32 = origchar
				36-10+127-32= 121
		} 
		else { 
		//encryptedChar = (originalChar + key);
		//encryptedChar -key = originalChar;
		result.append(encryptedChar);
		}
		}
		return result.toString();
		}
*/		
		
	}
}
	

