//problem 2 Doctor class
public class Doctor extends Person3 {

	private String specialty;
	private double fee;

	Doctor() {
		setName("No name yet");
		this.specialty = "None yet";
		this.fee = 0.0;
	}

	Doctor(String name, String specialty, double fee) {
		setName(name);
		setSpecialty(specialty);
		setFee(fee);
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public String getSpeciatly() {
		return specialty;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public double getFee() {
		return fee;
	}

}
