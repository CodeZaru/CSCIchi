
public class Billing {
	private Doctor physician;
	private Patient patient;
	
	Billing() {
		
	}
	
	Billing(Doctor physician, Patient patient){
		
	}
	
	public void setDoctor(Doctor physician) {
		
	}
	
	public void setPatient(Patient patient) {
		
	}
	
	public Doctor getDoctor() {
		return physician;//returning a doctor object, which returns all the strings..
		//return new Doctor();
	}
	
	public Patient getPatient() {
		return patient;
	}
	
}

//has a vs is a..  Billing has a doctor and has a patient and so we have a bill 