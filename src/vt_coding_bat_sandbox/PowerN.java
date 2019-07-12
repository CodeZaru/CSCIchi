package vt_coding_bat_sandbox;

public class PowerN {

	public static void main(String[] args) {

		System.out.println(powerN(3, 5));

	}

	public static int powerN(int base, int n) {
		  
		if (n == 0) 
			{
			System.out.println("entered terminal b/c n is 0 so return 1");
			return 1;
			}
		System.out.println("base: " + base + " * recursion based countdown control using n: " + n );
		  return base * powerN(base, n-1);
		}
}
