package prep;
import java.util.*;
public class CatsAndMouse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cA=sc.nextInt();
		int cB=sc.nextInt();
		int m=sc.nextInt();
		String res=catAndMouse(cA,cB,m);
		System.out.println(res);

	}
	static String catAndMouse(int cA, int cB, int z) {
		String res;
		if(Math.abs(z-cA)<Math.abs(z-cB)) {
			res="Cat A";
		}else if(Math.abs(z-cA)>Math.abs(z-cB)) {
			res="Cat B";
		}else {
			res="Mouse C";
		}
        return res;
    }


}