public class P258Prog8ProfT {
	public static void main(String[] args) {
		while (true) {
			System.out.print("\nAsk a question? y/n ");
			if ('y' != new java.util.Scanner(System.in).next().toLowerCase().charAt(0)) 
				break;
			
			switch ((int)(Math.random() * 8)) {
				case 1: System.out.println("It is certain"); break;
				case 2: System.out.println("It is decidedly so"); break;
				case 3: System.out.println("Most likely"); break;
				case 4: System.out.println("Signs point to yes"); break;
				case 5: System.out.println("Reply hazy, try again"); break;
				case 6: System.out.println("Ask again later"); break;
				case 7: System.out.println("Don't count on it"); break;
				case 0: System.out.println("My sources say no"); break;
			}
		}
	}
}