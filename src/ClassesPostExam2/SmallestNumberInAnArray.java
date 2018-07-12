
public class SmallestNumberInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++)
			numbers[i] = (int) (Math.random() * 100);

		for (int i = 0; i < numbers.length; i++)
			System.out.println(numbers[i]);

		// 1st step find the smallest
		// put the smallest to the front
		for (int index = 0; index < numbers.length; index++) {
			// 1st step find the smallest
			// int smallest = 100;
			int smallest = numbers[index];// change index [o] to dynamic variable[index]
			int smallestIndex = index;// identify index
			for (int i = index; i < numbers.length; i++) {
				if (smallest > numbers[i]) {
					smallest = numbers[i];
					smallestIndex = i;// important: this tells us where the
				}
				System.out.printf("Smallest number in the array is %d\n", smallest);
			}

			// Swap the smallest number to the beginning of the array.
			int temp = numbers[index];// changed index from hard coded [0] to [j]
			numbers[index] = numbers[smallestIndex];// changed index from hard coded [0] to [j]
			numbers[smallestIndex] = temp;

			// print the new array
			for (int i = 0; i < numbers.length; i++)
				System.out.println("swap smallest with what was index[0]:" + numbers[i]);

		}
	}
}
