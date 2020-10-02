package prep;
import java.util.*;
public class MissingNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
	 System.out.println(Arrays.toString(arr));
		int m=sc.nextInt();
		int brr[]=new int[m];
		for(int j=0;j<m;j++) {
			brr[j]=sc.nextInt();
		}
		
		 System.out.println(Arrays.toString(brr));
		
		Stack<Integer> stack1=new Stack<Integer>();
			for(int i=0;i<m;i++) {
				for(int j=i+1;j<m;j++) {
					if(brr[i]==brr[j]) {
						stack1.push(brr[j]);
						
					}
				}
			}
		
		System.out.println(stack1);
		
		
		Stack<Integer> stack2=new Stack<Integer>();
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					if(arr[i]==arr[j]) {
						stack2.push(arr[j]);
						
					}
				}
			}
		
			System.out.println(stack2);
		
		Arrays.sort(arr);
		Arrays.sort(brr);
		Set<Integer> set1=new HashSet<>();
		for(int v:arr) {
			set1.add(v);
		}
		Set<Integer> set2=new HashSet<>();
		for(int v:brr) {
			set2.add(v);
		}
		
		for(int element:set2) {
			if(!set1.contains(element)) {
				stack1.push(element);
			}
		}
		Iterator<Integer> itr1=stack1.iterator();
		if(!stack2.isEmpty()) {
			
			while(itr1.hasNext()) {
				Iterator<Integer> itr2=stack2.iterator();
				while(itr2.hasNext()) {
					if(stack1.peek()==stack2.peek()) {
						stack2.pop();
					}
				}
			}
		}
		while(itr1.hasNext()) {
			System.out.print(itr1.next()+" ");
		}
		
	}

}
