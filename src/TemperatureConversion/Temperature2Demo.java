
public class Temperature2Demo {

	public static void main(String[] args) {
		Temperature2 kitchen = new Temperature2(80, 'F');
		Temperature2 bedroom = new Temperature2(20, 'C');
		
		System.out.println("Kitchen Temperature2 is: " + kitchen.getCelsius());
		System.out.println("Bedroom Temperature2 is: " + bedroom.getCelsius());
		
		if (kitchen.isGreater(bedroom))
			System.out.println("Kitchen is warmer.");
		else
			System.out.println("bedroom is warmer.");
	}

}