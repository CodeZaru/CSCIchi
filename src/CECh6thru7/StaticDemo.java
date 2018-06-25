
public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticExample myAccount = new StaticExample();

		
		System.out.println(myAccount.getBalance());;
		System.out.println(myAccount.getNumberOfAccounts());;

		StaticExample yourAccount = new StaticExample(5000);		
		System.out.println(yourAccount.getBalance());;
		System.out.println(yourAccount.getNumberOfAccounts());;
		
	}

}
