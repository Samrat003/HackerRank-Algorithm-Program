package prep;
import java.util.*;
public class JumpingOnTheClouds {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c[]=new int[n];
		for(int i=0;i<n;i++) {
			c[i]=sc.nextInt();
		}
		int result=jumpingOnClouds(c);
		System.out.println(result);
	}
	static int jumpingOnClouds(int[] c) {
		int len = c.length;
		int count = -1;

		for (int i = 0; i < len;) {
			if (i + 2 < len && c[i + 2] == 0) {
				i = i + 2;
			} else {
				i++;
			}

			count++;
		}
		return count;

    }


}
