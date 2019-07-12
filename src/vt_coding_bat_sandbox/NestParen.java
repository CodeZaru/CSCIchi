package vt_coding_bat_sandbox;

public class NestParen {

	public static void main(String[] args) {
		System.out.println(nestParen("y this (sucks())"));
		System.out.println(nestParen("((a))"));
	}

	public static boolean nestParen(String str) {

		if (str.equals("")) 
		  {
			  System.out.println("Create Special Terminating Case");
			  return true;
		  }
		  
		  if (str.charAt(0) == '(' && str.charAt(str.length()-1) == ')')
		  {
			  System.out.println("check first and last char, then recurse");
			  System.out.println("the recurse w/ subStr param starting at index 1 \n"
					  +"and cutting the last char off via ending index up to but not to include..");
			    return nestParen(str.substring(1,str.length()-1));			  
		  }

		  else
		  {
			  System.out.println("If not pur parens then return false");
			    return false;			  
		  }

		}
	
}
