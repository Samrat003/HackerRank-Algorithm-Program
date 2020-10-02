package prep;
import java.util.*;
public class SequenceEquation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		List<Integer> li=new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
            list.add(sc.nextInt());
        for(int i = 1; i <= n; i++) {
        	li.add(list.indexOf(list.indexOf(i)+1)+1);
        }
           int arr[]=new int[n];
           for(int i=0;i<n;i++) {
        	   arr[i]=li.get(i);
           }
           for(int i=0;i<n;i++) {
        	   System.out.print(arr[i]+" ");
           }
	}

}
