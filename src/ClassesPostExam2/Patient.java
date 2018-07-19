
public class Patient extends Person3{
	
	private String patientID;
	
	Patient(){
		
	}

	Patient(String patientID){
		setPatientID(patientID);
	}
	
	Patient(String patientName, String patientID){
		setName(patientName);
		setPatientID(patientID);
		
	}
	
	public String getPatientID() {
		return patientID;
	}
	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}
	
	
}
