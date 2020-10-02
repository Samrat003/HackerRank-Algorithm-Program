package prep;
import java.util.*;
public class HuddleRace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] height = new int[n];
		for(int i=0;i<n;i++) {
			height[i]=sc.nextInt();
		}
		Arrays.sort(height);
		int max=height[n-1];
		//System.out.println(max);
		if(k>max) {
			System.out.println(0);
		}else {
			System.out.println(max-k);
		}
	}

}
