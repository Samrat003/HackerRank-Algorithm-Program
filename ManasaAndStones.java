package prep;
import java.util.*;
public class ManasaAndStones {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int res[]=stones(n,a,b);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}

	}
	 static int[] stones(int n, int a, int b) {

	        int[] arrStones=new int[n];
	        if(a==b){
	        	int c[] = { a * (n - 1) };
				return c;
	        	}
	        else {
	            if(a>b){
	            	int temp=a;
	            	a=b;
	            	b=temp;
	            }
	            for(int i=0;i<n;i++){
	            	int temp=a*((n-1)-i)+b*i;
	            	arrStones[i]=temp;
	            }
	        }
	        Arrays.sort(arrStones);
	        return arrStones;
		 

	 }

}
