package prep;

import java.util.*;

public class CountingVallyes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int count=0,total=0;
		int n= sc.nextInt();
		sc.nextLine();
		String inp=sc.nextLine().toUpperCase();
		if(inp.length()==n) {
			for(int i=0;i<n;i++) {
				Character c1=inp.charAt(i);
				if(c1.equals('U')) {
					count++;
				}else {
					if(c1.equals('D')) {
						count--;
						if(count==-1) {
							total++;
						}
					}
				}
			}
			
		}
		
		System.out.println(total);
	}

}
