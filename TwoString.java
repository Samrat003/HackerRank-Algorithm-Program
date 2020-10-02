package prep;
import java.util.*;
public class TwoString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		while(n>0) {
			String s1=sc.next();
			String s2=sc.next();
			
			Set<Character> str1 = new HashSet<Character>();
            Set<Character> str2 = new HashSet<Character>();
            for(int i=0;i<s1.length();i++){
                str1.add(s1.charAt(i));
            }
            for(int i=0;i<s2.length();i++){
                str2.add(s2.charAt(i));
            }
            str1.retainAll(str2);
            if(!str1.isEmpty()) {
               System.out.println("YES");
            }else {
            	System.out.println("NO");
            }
            
			n--;
		}
		
		
	}

}
