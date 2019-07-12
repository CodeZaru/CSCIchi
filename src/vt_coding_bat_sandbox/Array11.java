package vt_coding_bat_sandbox;

public class Array11 {

	public static void main(String[] args) {

		int[] nums = {2,33,11,55,66,77,88,99,11,12,11,55,11};
		System.out.println(array11(nums, 6));
	}
	public static int array11(int[] nums, int index) {
		
		  if (index >= nums.length)
			  {
				System.out.println("entered terminal to prevent out of bounds");
			  return 0;
			  }
		  if (nums[index] == 11)
			  {
			  System.out.println("Case: we HAVE an \"11\" in the array");
			  System.out.println("So rack up a count, and crawl up the array's index by one");
			  System.out.println("recursive call to array11 method and pass in new index");
			  return 1 + array11(nums,index+1);
			  }
		  else 
			  {
			  System.out.println("Case: we DON'T have an \"11\" in the array");
			  System.out.println("So rack up a count, and crawl up the array's index by one");
			  System.out.println("recursive call to array11 method and pass in new index");
			  return array11(nums,index+1);
			  }
		}
}
