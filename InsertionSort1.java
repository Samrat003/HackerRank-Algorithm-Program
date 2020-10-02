package prep;
import java.util.*;
public class InsertionSort1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		insertionSort1(n,arr);
	}
	static void insertionSort1(int n, int[] arr) {
			
			int temp=arr[n-1];
			for(int j=n-2;j>=0;j--) {
				if(arr[j]>temp) {
					arr[j+1]=arr[j];
					for(int i=0;i<n;i++) {
						System.out.print(arr[i]+" ");
					}
					System.out.print("\n");
				}else {
					arr[j+1]=temp;
					for(int i=0;i<n;i++) {
						System.out.print(arr[i]+" ");
					}
					break;
				}
				
				if((j==0) && arr[j]>temp) {
					arr[j]=temp;
					for(int i=0;i<n;i++) {
						System.out.print(arr[i]+" ");
					}
				}
				
			}
//			System.out.print("\n");
//			for(int i=0;i<n;i++) {
//				System.out.print(arr[i]+" ");
//			}
	
    }


}
