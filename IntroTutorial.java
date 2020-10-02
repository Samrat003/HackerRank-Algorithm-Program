package prep;
import java.util.*;
public class IntroTutorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int v=sc.nextInt();
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int result=introTutorial(v,arr);
		System.out.println(result);
	}
	
	static int introTutorial(int V, int[] arr) {
		List<Integer> li=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			li.add(arr[i]);
		}
        int res=li.indexOf(V);
		return res;
    }

}
