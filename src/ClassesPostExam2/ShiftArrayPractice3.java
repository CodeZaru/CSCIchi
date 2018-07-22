
public class ShiftArrayPractice3 {
	
	public static void main(String[] args) {
		
		int [] numbers = new int [] {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
		
		for(int i = 0; i < numbers.length; i++)
		System.out.printf("%d, ", numbers[i]);
		System.out.println();

	int temp = 0;
	temp = numbers[numbers.length-1];//add this line to modify shift to rotate
	
	for(int i = numbers.length-2; i >= 0; i--)
	{
		numbers[i+1] = numbers[i];
	}

//	numbers[0]=0;
	numbers[0] = temp;//add this line to modify shift to rotate
	
	for(int i = 0; i < numbers.length; i++)
	System.out.printf("%d, ", numbers[i]);
	
	
	
	
	
	
	
	}

}
