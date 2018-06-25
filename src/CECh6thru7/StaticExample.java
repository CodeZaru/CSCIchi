
public class StaticExample {

		private double balance;
		private static int numberOfAccount;
		
		StaticExample() {
			balance = 0;
			numberOfAccount++;
		}
		
		StaticExample(double balance) {
			this.balance = balance;
			numberOfAccount++;
		}
	
	
//	StaticExample(double balance){
		
	public double getBalance() 
		{ 
			return balance; 
			}

	public	static int getNumberOfAccounts() 
	{ 
		return numberOfAccount; 
		}
	

//IMPORTANT TO KNOW
	
	//a static method doesn't access a non-static variable
	//static can't see this
	

	//non static method can access both static and non-static variable.

//	PROBLEM #9
//	IN OUR CONSTRUCTOR WE USE SIMPLIFY METHOD WHICH CALLS GET GCD
//	simpley is like a set/mutator method
// RECEIVE X AND Y FROM SIMPILIFY AND WE LIKELY MAKE GET GCD STATIC.. EVEN THOUGH DON'T HAVE STATIC
	//RETURNS ONE INT (THE GCD) AND THAT HELPS YOU TO FIND UPDATE NUMERATOR/GCD AND DEMNOMINTOR/GCD
	//RETURN NUM/DENOM
	
}
