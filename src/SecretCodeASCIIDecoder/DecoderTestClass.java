
public class DecoderTestClass {

	public static void main(String[] args) {
		// Test1
		testsecretDecoder();
	}

	public static void testsecretDecoder() {
		Decoder testDecoder = new Decoder();
		//String testSecretCode = "Ro$";
		String testSecretCode = ":mmZ\\dxZmx]Zpgy";		
		String testsecretDecoderResult = testDecoder.secretDecoder(testSecretCode);
		System.out.println("testSecretDecoderResult: " + testsecretDecoderResult);

	}

}
