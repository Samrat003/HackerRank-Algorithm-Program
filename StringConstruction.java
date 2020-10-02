package prep;
import java.util.*;
public class StringConstruction {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	while(n>0) {
		String s=sc.next();
		int res=stringConstruction(s);
		System.out.println(res);
		}

	}
	 static int stringConstruction(String s) {

		 	int count = 0;
			int charArray[] = new int[26];
			for (int i = 0; i < s.length(); i++) {
				int index = s.charAt(i) - 'a';
				charArray[index]++;
			}
			for (int i = 0; i < 26; i++) {
				if (charArray[i] != 0)
					count++;
			}
			return count;
		 
	 }

}
