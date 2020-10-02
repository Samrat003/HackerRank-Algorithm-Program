

package prep;
import java.util.*;
public class RunningTimeOfAlgorithm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int res=runningTime(arr);
		System.out.println(res);
	}
	static int runningTime(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) { 
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
					count++;
				}
			}
		}

		return count;
	}
}
