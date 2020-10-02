package prep;
import java.util.*;
public class SherlockAndArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> arr=new ArrayList<>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			arr.add(sc.nextInt());
		}
		String result=balancedSums(arr);
		System.out.println(result);

	}
	static String balancedSums(List<Integer> arr) {
        
		int sum = 0;
        // get sum of all array index.
        for (int i = 0; i < arr.size(); i++){
            sum += arr.get(i);
        }

        // initially left sum is zero.
        int leftSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            //if left sum equals right sum print yes.
            if (leftSum == (sum - leftSum - arr.get(i))) {
                return "YES";
            }

            leftSum += arr.get(i);
        }

        return "NO";
    }

}
