package vT_Test7;

public class looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i = 0;
		while (i < 10)
		{
			sum = sum + i;
			i++;
			System.out.println("sum: " + sum);
		}
		System.out.println("sum: " + sum);
		
		int sum2 = 0;
		for (int j= 0; j<10; j++)
		{
			sum2 = sum2 + j;
			System.out.println("sum2: "+ sum2);
		}
		System.out.println("sum2: "+ sum2);

	}

}
