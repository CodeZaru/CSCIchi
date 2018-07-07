
public class TemperatureDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temperature kitchen = new Temperature(80, 'F');
		Temperature bedroom = new Temperature(20, 'C');
		
		System.out.println("kitchen temp is: " + kitchen.getCelsius()+" C.");
		System.out.println("Bedroom temp is: " + bedroom.getCelsius()+" C.");

		System.out.println("Bedroom temp is: " + bedroom.getFarenheit()+" F.");
		
		if (kitchen.isGreater(bedroom))
			System.out.println("k is warnmer.");
			else
			System.out.println("b is warnmer.");
		
		System.out.println(kitchen);
		System.out.println(kitchen.toString());
	}

}
