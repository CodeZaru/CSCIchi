import java.util.Scanner;

public class Characteristic {
//page 462 and 467	
	private String description;
	private int rating;
	
	Characteristic(){
		
	}
	
	Characteristic(String description){
		this.description = description; //if argument name is different from property then can drop the 'this' keyword.
		this.rating = 0;
	}
	
	Characteristic(String description, int rating){
		this.description = description; 
		this.rating = rating;
	}
	
	
	private boolean isValid(int rating) {
//ex. 1
//		if (rating >= 1 && rating <= 10)
//			return true;
//		else
//			return false;		
//ex. 2
//		return (rating >= 1 && rating <= 10) ? true : false;//if parens true or if parens false
//ex. 3
		return (rating >= 1 && rating <= 10);
	}
//review what sentenal value is...
	
	public void setRating(int aRating) {
		if (isValid(aRating))
			this.rating = aRating;
	}
	
	public void setRating() {
		int rating;
		Scanner keyboard = new Scanner(System.in);
		do {
			System.out.print("Enter a rating (between 1-10): ");
			rating = keyboard.nextInt();
		} while (!isValid(rating));
		setRating(rating);
		keyboard.close();
	}

	public String getDescription() {
		return this.description;
	}
	
	
	public int getRating() {
		return this.rating;
	}

	public double getCompatibility(Characteristic other) {
//	if (other.getRating() == 0 || this.rating == 0)

		//		if (!this.description.equalsIgnoreCase(other.description))
//			return 0.0;
//		else
//			return getCompatibilityMeasure(other);
	
//		return(this.description.equalsIgnoreCase(other.description))
//		? getCompatibilityMeasure(other)
//		: 0.0;
		
		return (isMatch(other))
				? getCompatibilityMeasure(other)
				: 0.0;
		
		
	}

	private double getCompatibilityMeasure(Characteristic other) {
//		double m = 0.0;
//		if (this.rating == 0 || other.rating == 0)
//			m = 0.0;
//		else
//		m = 1 - ((this.rating - other.rating)^ 2) / 81.0; 

//		return m;

		return (this.rating == 0 || other.rating == 0)
				? 0.0
				//: 1 - ((this.rating - other.rating)^2) / 81.0;//NOTE: the carrot doesn't square
				: 1 - (Math.pow((this.rating - other.rating), 2) / 81.0);					
	}

	private boolean isMatch(Characteristic other) {
		return this.description.equalsIgnoreCase(other.description);
	}



}
