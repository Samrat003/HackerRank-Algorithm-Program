package prep;
import java.util.*;
public class Anagrams {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();	
		
				
		int minNoOfChanes=0;
		int charFreq[] = new int[26];
		
		for (int i = 0; i < str1.length(); i++) {
			int index = str1.charAt(i) - 'a';
			if (i < str1.length() / 2) {
				charFreq[index]++;
			} else {
				charFreq[index]--;
			}
		}
		for (int i = 0; i < 26; i++) {
			if (charFreq[i] > 0) {
				minNoOfChanes += charFreq[i];
			}

		}
		if ((str1.length() & 1) == 1) {
			System.out.println(-1);
		}else {
			System.out.println(minNoOfChanes);
		}
	        
		
	}

}
