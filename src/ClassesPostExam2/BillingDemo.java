
public class BillingDemo {

	public static void main(String[] args) {

		Patient p1 = new Patient();
		Patient p2 = new Patient();

		Doctor d1 = new Doctor();
		Doctor d2 = new Doctor();
	
		Billing b1= new Billing();
		Billing b2= new Billing();
		Billing b3=new Billing(new Doctor("John", "Dentist", 200), 
								new Patient("Jerry", "A0123"));
	
		double totalBill = b1.getDoctor().getFee() + b2.getDoctor().getFee();//contains doctor and patient so doctor1 fee and 2nd bill doctor2 fee
	
	//this is actually an array of bills and for each bill that has a name of john you add up and for each bill with name of Jane and add it up.
	
	}

}
