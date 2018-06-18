//N17v2
public class PokeCandy2 {

	public static void main(String[] args) {

		int candy = 200, edoc = 200, margorp = 0, experience = 0;

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
