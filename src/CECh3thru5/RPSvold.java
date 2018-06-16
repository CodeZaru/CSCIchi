
public class RPSvold {

	public static void main(String[] args) {
		
		char user = 'R';
		
		// TODO Auto-generated method stub
		switch ((int)(Math.random() * 3)) {
			case 0: System.out.println("Rock"); 
					if (user == 'R')
						System.out.println("Draw");
								
					if (user == 'P')
						System.out.println("User win!");								
								
					if (user == 'S')
						System.out.println("Computer Win");
								
					break;
					
			case 1: System.out.println("Paper"); break;
			case 2: System.out.println("Scissor"); break;
		}

	}

}
