
public class endOther2 {

	
	public boolean endOther2(String a, String b) {

	  String lowerCaseStringA = a.toLowerCase();
	  int stringLengthA = a.length();
	  String lowerCaseStringB = b.toLowerCase();
	  int stringLengthB = b.length();
	  String shortStringA = null;
	  String shortStringB = null; 
	  
	  if (stringLengthA == stringLengthB) {

		  return (lowerCaseStringA.compareTo(b) == 0) ? true : false);
	  }else if (stringLengthA > stringLengthB)
		  shortStringA = lowerCaseStringA.substring(stringLengthA - stringLengthB, stringLenghtA);
	  return ((shortStringA.compareTo(lowerCaseStringB) == 0 ) ? true : false);
	}  
	  else
	  {
	      return false;
	  }
	     

	  } else {

	    String temp = a.substring(aLen - bLen, aLen);

	    if (temp.compareTo(b) == 0)

	      return true;

	    else

	      return false;

	  }

	   

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
