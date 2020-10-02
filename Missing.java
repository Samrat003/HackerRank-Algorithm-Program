package prep;

import java.util.*;


public class Missing {
	

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr1[]=new int[10000];
	int arr2[]=new int[10000];
	int T=sc.nextInt();
	for(int i=0;i<T;i++)
	{
	int num=sc.nextInt();
	arr1[num]+=1;
	}
	int N=sc.nextInt();
	for(int j=0;j<N;j++)
	{int num=sc.nextInt();
	arr2[num]+=1;
	}
	List<Integer> li =new ArrayList<>();
	for(int l=0;l<10000;l++)
	{
		if(Math.abs(arr1[l]-arr2[l])>0) {
			li.add(l);
		}
		else {
			continue;
		}
	}
	 int [] a = new int[li.size()];
	 for(int i=0;i<li.size();i++) {
		 a[i]=li.get(i);
	 }
	 for(int i=0;i<li.size();i++) {
		 System.out.println(a[i]);
	 }
	
}
}
