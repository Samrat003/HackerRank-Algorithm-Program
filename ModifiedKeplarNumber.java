package prep;
import java.util.*;
public class ModifiedKeplarNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int q=sc.nextInt();
		kaprekarNumbers(p,q);

	}
	static void kaprekarNumbers(int p, int q) { 
		List<Integer> li=new ArrayList<>();
		for(int i=p;i<=q;i++) {
			long squared = (long) i* i;
	        String str   = String.valueOf(squared);
	        String left  = str.substring(0, str.length() / 2);
	        String right = str.substring(str.length() / 2);
	        int numL = (left.isEmpty())  ? 0 : Integer.parseInt(left);
	      
	        int numR = (right.isEmpty()) ? 0 : Integer.parseInt(right);
	       
	        if(numL+numR==i) {
	        	li.add(i);
	
	        }
		}
		if(!li.isEmpty()) {
			for(int i=0;i<li.size();i++){
			    System.out.print(li.get(i)+" ");
			} 
		}else {
			System.out.println("INVALID RANGE");
		}
		
		

    }


}
