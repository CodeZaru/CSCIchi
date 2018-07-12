
public class MoneyDemo2 
{
	public static void main(String[] args) 
	{
		Money2 start = new Money2();
		Money2 goal = new Money2();
		
		System.out.println("Enter your current savings: ");
		start.readInput();
		
		goal = start.times(2);
		System.out.print(
				"If you double that, you will have ");
		goal.writeOutput();
		
		System.out.println(", or better yet:");
		goal = start.add(goal);
		System.out.println(
				"If you triple that original amount, you will have:");
		goal.writeOutput();
		System.out.println();
		
		System.out.println("Remember: A penny saved");
		System.out.println("is a penny earned.");
		

	}

}
