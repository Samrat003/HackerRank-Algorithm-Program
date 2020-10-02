package prep;
import java.util.*;
public class LoveLetterMystery {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int k=1,count=0;
			for(int i=0;i<s.length()/2;i++) {
				char f=s.charAt(i);
				char l=s.charAt(s.length()-k);
				if(f<l) {
					while(f!=l) {
						l-=1;
						count++;
					}
				}else {
					while(f!=l) {
						f-=1;
						count++;
					}
				}
				k++;
				
			}
		System.out.println(count);
		
		

	}

}
