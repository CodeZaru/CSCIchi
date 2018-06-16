//P255Prob2
public class ReverseBanana {
//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input = "banana";

String intermediate = input.substring(1) + input.charAt(0);
System.out.println(intermediate);;
	
String reverse = "";
for (int i=0; i < intermediate.length(); i++)
	reverse += intermediate.charAt(intermediate.length() -1 -i);//this is the trick to reverse but also try the down counting method
System.out.println(reverse);
	
	
	}

	
}
