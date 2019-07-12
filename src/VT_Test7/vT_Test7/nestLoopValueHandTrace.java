package vT_Test7;

public class nestLoopValueHandTrace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double price = 10;
		System.out.println(price);
		
		int firstVal= 2;
		
		do 
		{
		for (int x = 0; x < 3; x++)
		{
			firstVal++;
		}
		if (firstVal >= 10)
		{
			firstVal = firstVal - 10;
		}
		System.out.print(firstVal + ", ");
		}
			
		while (firstVal !=9);

		System.out.println();
		
		String word = "";
		while (word.length() < 4)
		{
			word = word + "a";
		}
		System.out.println(word);
		
		int sum = 0;
		int i = 0;
		while (i < 10)
		{
			sum = sum + i;
			i++;
		}
		System.out.println("sum: " + sum);
		
		int sum2 = 0;
		for (int j= 0; j<10; j++)
		{
			sum2 = sum2 + j;
		}
		System.out.println("sum2: "+ sum2);
		
		
		int pitch = 440;
		if (pitch == 440)
		{
			System.out.println("equal");
		}
		System.out.println();;
		
		int x;
		int count = 0;
		for(x=0; x<50;x=x+4)
		{
			System.out.println("x: " + x);
			count++;
			System.out.println("count: " + count);
		}
		
	}

}
