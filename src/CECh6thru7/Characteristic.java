import java.util.Scanner;

public class Characteristic {
	
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
		}while (!isValid(rating));
		setRating(rating);
		keyboard.close();
	}


}
