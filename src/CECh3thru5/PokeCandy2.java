//N17v2
public class PokeCandy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int candy = 200, edoc = 200, margorp = 0, experience = 0;
		//Exp 18000 and candies 4 Edoc 0 and margorp
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

				 while ((candy < 12) && (edoc > 0)) {
					edoc--;
					candy++;				

			}
		
		}
		System.out.printf("Experience:  %d \n", experience);
		System.out.printf("Edoc:  %d \n", edoc);
		System.out.printf("Margorp:  %d \n", margorp);
		System.out.printf("Candy:  %d \n", candy);
	}

}
