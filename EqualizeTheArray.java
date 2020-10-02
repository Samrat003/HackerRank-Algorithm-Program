package prep;
import java.util.*;
public class EqualizeTheArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int result=equalizeArray(arr);
		System.out.println(result);

	}
	static int equalizeArray(int[] arr) {
		
		Map<Integer, Integer> mp = new HashMap<>(); 
		  
        for (int i = 0; i <arr.length; i++) 
        { 
            if (mp.containsKey(arr[i]))  
            { 
                mp.put(arr[i], mp.get(arr[i]) + 1); 
            }  
            else
            { 
                mp.put(arr[i], 1); 
            } 
        }
        int maxValue=Collections.max(mp.values());
        int result=Math.abs(maxValue-arr.length);
        return result;
    }
}
