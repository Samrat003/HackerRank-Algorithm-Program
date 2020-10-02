package prep;
import java.util.*;
public class MakingAnagrams {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		StringBuilder firstBuilder = new StringBuilder(str1);
	    StringBuilder secondBuilder = new StringBuilder(str2);
	    int numberNeeded = firstBuilder.length() + secondBuilder.length();

	    for (int i=0; i<str1.length(); i++) {

	        char currentChar = str1.charAt(i);

	        for (int j=0; j<secondBuilder.length(); j++) {
	            char charToCompare = secondBuilder.charAt(j);

	            if (charToCompare == currentChar) {
	                firstBuilder.deleteCharAt(0);
	                secondBuilder.deleteCharAt(j);
	                numberNeeded -= 2;
	                break;
	            }
	        }
	    }
		System.out.println(numberNeeded);
	}

}
