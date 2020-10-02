package prep;
import java.util.*;
public class DesignerPdfViewer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int len[]=new int[26];
		for(int i=0;i<26;i++) {
			len[i]=sc.nextInt();
		}
		String word=sc.next();
		
		List<Integer> li=new ArrayList<>();
		for(int i=0;i<word.length();i++) {
			int index = word.charAt(i) - 'a';
			int num=len[index];
			li.add(num);
		}
		Collections.sort(li,Collections.reverseOrder());
		int max=li.get(0);
		System.out.println(max*word.length());
	}

}
