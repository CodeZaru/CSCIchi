package vt_coding_bat_sandbox;

public class testCodingBatDriver {

	public static void main(String[] args) {
	
		int testInput = 717;
	Scratch count7Test = new Scratch(testInput); 
//
//		Count7 intInstance = count7Test;
//	count7Test.toString();
//		
		System.out.println(count7Test.count7Method(testInput));
//		System.out.println("2: " + numberAsString);
	
		//Count7
			int result = 0;
		
			  if (testInput < 1) 
				  {
				  System.out.println("return from inside terminal limit:" + result);				  }
			  if (testInput % 10 == 7) //finds if right most int is an 7
				  { // if so it does this code block..
				  result = 1 + count7MethodInDriver(testInput/10); 
				  // dividing by 10 (b/c is an int)
				  // we effectively truncate and we call the method
				  // and process the next integer and count.. 
				  // again if furthest right is 7 then truncate and 
				  // call method again.. if no 7 we drop thru to 
				  // the else which doesn't add to count but 
				  // calls method again after truncating
				  // then we finally drop out when the testInput 
				  // goes to less than one.
				  }
			  else 
			  	  {
				  count7MethodInDriver(testInput/10);
			       }

			  System.out.println("return from Driver:" + result);
		
	}
	
	public static int count7MethodInDriver(int n) {
		// add lingo regarding recursion  
		  if (n < 1) return 0; // and terminal stmt 
		// and count ones place and truncate to tens and repeat  method recursively
		  if (n % 10 == 7) return 1 + count7MethodInDriver(n/10); 
		// and if no 7 in ones place to count then truncate to bring tens place to ones place
		  //and repeat recursion 
		  else return count7MethodInDriver(n/10);
		  // repeat until we get to the terminal stmt that doesn't repeat a call to method
		}

}
