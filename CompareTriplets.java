package prep;
import java.util.*;
public class CompareTriplets {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> li1=new ArrayList<>();
		List<Integer> li2=new ArrayList<>();
		
		for(int i=0;i<3;i++) {
			int num=sc.nextInt();
			li1.add(num);
		}
		for(int i=0;i<3;i++) {
			int num=sc.nextInt();
			li2.add(num);
		}
		int alice=0,bob=0;
		for(int i=0;i<3;i++) {
			int a=li1.get(i);
			int b=li2.get(i);
			if(a>b) {
				alice++;
			}
			if(b>a) {
				bob++;
			}
		}
		Deque<Integer> dq=new LinkedList<Integer>();
		dq.push(alice);
		dq.addLast(bob);
		List<Integer> l=new ArrayList<>(dq);
		System.out.println(l);
	}

}
