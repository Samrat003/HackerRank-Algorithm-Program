package prep;
import java.util.*;
public class CircularArrayRotation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int q=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int queries[]=new int[q];
		for(int i=0;i<q;i++) {
			queries[i]=sc.nextInt();
		}
		int result[]=circularArrayRotation(arr,k,queries);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}

	}
	static int[] circularArrayRotation(int[] arr, int k, int[] queries) {
        
			for (int i = 1; i <=k; i++) 
	        { 
	            int temp = arr[arr.length-1]; 
	             
	            for (int j = arr.length-1; j > 0; j--) 
	            {
	                arr[j] = arr[j-1];
	            }
	             
	            arr[0] = temp;
	        }
		int result[]=new int[queries.length];
		for(int i=0;i<queries.length;i++) {
			result[i]=arr[queries[i]];
		}
		return result;
		
		
		
//		 k = k % arr.length;
//		    int[] result = new int[queries.length];
//		    for (int i = 0; i < result.length; i++) {
//		      result[i] = a[(queries[i] - k + arr.length) % arr.length];
//		    }
//
//		    return result;
		
		//optimised solution

    }
	

}
