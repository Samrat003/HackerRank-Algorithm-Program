package prep;

import java.util.*;

public class InsertionSort2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		insertionSort2(n,arr);

	}
	static void insertionSort2(int n, int[] arr) {

		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
			for(int k=0;k<n;k++) {
				System.out.print(arr[k]+" ");
			}
			System.out.println("");
		}
    }

}
