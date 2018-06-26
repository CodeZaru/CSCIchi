
public class CharacteristicDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Characteristic john = new Characteristic("athletic", 10);
		Characteristic jane = new Characteristic("adventurous", 8);
		Characteristic jack = new Characteristic("adventurous", 2);
		
		System.out.println(john.getCompatibility(jane));
		System.out.println(jack.getCompatibility(jane));
		System.out.println(jack.getCompatibility(john));;
	}

}
