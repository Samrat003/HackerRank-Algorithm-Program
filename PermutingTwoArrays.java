package prep;
import java.util.*;
public class PermutingTwoArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int k=sc.nextInt();
			int A[]=new int[n];
			int B[]=new int[n];
			for(int i=0;i<n;i++) {
				A[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++) {
				B[i]=sc.nextInt();
			}
			sc.close();
			String res=twoArrays(k,A,B);
			System.out.println(res);


	}
	 static String twoArrays(int k, int[] A, int[] B) {
		 Arrays.sort(A);
	     Arrays.sort(B);

	     for (int i = 0, j = A.length - 1; i < A.length; i++, j--) {
	        if (B[i] + A[j] < k){
	        	 return "NO";
	        	}
	        }
	          
	     return "YES";

	 }

}
