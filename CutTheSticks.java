package prep;
import java.util.*;
public class CutTheSticks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int[] result = cutTheSticks(arr);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}		

	}
	static int[] cutTheSticks(int[] arr) {
		List<Integer> al=new ArrayList<>();
		List<Integer> li=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			al.add(arr[i]);
		}
		 	Collections.sort(al);
		    for(int i=0; i<al.size(); i++){
		        if(al.get(0)==0){
		        	al.remove(0); 
		        	i=-1; 
		        	continue;
		        }
		        li.add(al.size());
		        int min=al.get(0);
		        for(int j=0; j<al.size(); j++){       
		            al.set(j, al.get(j)-min);
		        }
		    }
		    int res[]=new int[li.size()];
		    for(int i=0;i<li.size();i++) {
		    	res[i]=li.get(i);
		    }
		    return res;
	}

}
