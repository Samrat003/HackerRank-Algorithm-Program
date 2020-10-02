package prep;
import java.util.*;
public class MarkAndToys {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int total=maximumToys(arr,k);
		System.out.println(total);

	}
	static int maximumToys(int[] prices, int k) {
		
		Arrays.sort(prices);
		int sum=0,count=0;
		for(int i=0;i<prices.length;i++) {
			sum=sum+prices[i];
			if(sum<=k) {
				count++;
			}else {
				break;
			}
		}
		return count;

    }

}
