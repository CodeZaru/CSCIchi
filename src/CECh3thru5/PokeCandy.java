//N17
public class PokeCandy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int candy = 71, edoc = 53, margorp = 0, experience = 0;
		
		while (candy >= 12) {
			//perform evolution
			candy -= 12;
			edoc--;
			margorp++;
			experience += 500;
			candy++;
			
			//perform Transfer Margorp
			candy++;
			margorp--;
			
			//Perform Transfer Edoc
		//	if ((candy < 12) && (edoc >= 12)) {
		//		System.out.println("less than 12");
		//		candy += 12;
		//		edoc -= 12;
//				if (edoc > 12) edoc -= (12 - candy);
//				candy = 12;
//				edoc = edoc - (12 - candy);
			//	
			if ((candy < 12))
				do {
					edoc--;
					candy++;				
				} while ((candy < 12) && (edoc > 0));						
			}
		
		
		System.out.printf("Experience:  %d \n", experience);
		System.out.printf("Edoc:  %d \n", edoc);
		System.out.printf("Margorp:  %d \n", margorp);
		System.out.printf("Candy:  %d \n", candy);
	}

}
