package prep;
import java.util.*;
public class UtopainTree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int result=utopianTree(n);
		System.out.println(result);
	}
	
	static int utopianTree(int n) {
		int h=1;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				h++;
			}else {
				h=h*2;
			}
		}
		if(n!=0) {
			return h;
		}
		return h;
    }

}
