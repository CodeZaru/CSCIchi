
public class Decoder {

	public static void main(String[] args) {
		
		String testSecretCode = ":mmZ\\dxZmx]Zpgy";
		String testsecretDecoderResult = secretDecoder(testSecretCode);
		System.out.println("testSecretDecoderResult: " + testsecretDecoderResult);

	}

	public static String secretDecoder(String secretCode) {

		String secretCodeStr = secretCode;

		int secretCodeCharASCIIValue;
		int decodedSecretCodeCharASCIIValue;
		char decodedSecretCodeChar;

		int key = 1;
		while (key <= 100) {
			// for (key = 1; key <= 10; key++ ) {
			StringBuffer result = new StringBuffer();
			//System.out.println("key value equals: " + key);

			for (int i = 0; i < secretCodeStr.length(); i++) {

				char secretCodeChar = secretCodeStr.charAt(i);

				secretCodeCharASCIIValue = (int) secretCodeChar;// convert char to ASCII code

				// System.out.println("secretCode: " + secretCodeChar);
				// System.out.println("secretCodeCharASCIIValue: " + secretCodeCharASCIIValue);

				// System.out.println("key value equals: " + key);

				if (secretCodeCharASCIIValue - key < 32) {
					decodedSecretCodeCharASCIIValue = ((secretCodeCharASCIIValue - key) + 127) - 32;
				} else {
					decodedSecretCodeCharASCIIValue = (secretCodeCharASCIIValue - key);
				}

				decodedSecretCodeChar = (char) decodedSecretCodeCharASCIIValue;
				result.append(decodedSecretCodeChar);

				// System.out.println("secretCodeResult: " + result);
			}
			System.out.println("Key Value: " + key +" SecretCodeResult: " + result);
			// System.out.println("key before increment: " + key);
			key++;
			// System.out.println("key after increment: " + key);

		}
		return "END";// result.toString();
	}
}

// Comments:
/*
 * The problem was tricky in that they gave us the algorithm as if we started
 * with the original word and wanted to encrypt it. But it was actually the
 * opposite, so we had to reverse engineer the formula: if (originalChar + key >
 * 126) if (encryptedChar - key < 32) { encryptedChar = 32 + ((int)(originalChar
 * + key) - 127); encryptedChar - key + 127 -32 = origchar 36-10+127-32= 121 }
 * else { encryptedChar = (originalChar + key); encryptedChar -key =
 * originalChar; }
 * 
 * Other details of the problem: //they are setting encrytedChar = to an int and
 * converitng the int to a char //if original char plus the key are >126 (i.e.
 * origChar of 126 plus any positive non-zero number //so 126+1 is 127 minus 127
 * is 0 plus 32 to get it back to the beginning of ascii which is 32. //the
 * "if (guard)" created the wrap and if guard is N/A then it is straight
 * forward... //so they reset or wrap to the beginning of the ascii character,
 * and the key impacts where the reset happens //so really looks like there are
 * only 94 characters thru which to iterate (126-32).
 * 
 * //It seems like this might require nested loops. The outer one to go through
 * each key // and the inner one to go through all possible characters for a
 * given key for the whole secret word.
 */
