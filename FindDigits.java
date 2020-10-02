package prep;
import java.util.*;
public class FindDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int result=findDigits(n);
		System.out.println(result);
		
	}	
	 static int findDigits(int n) {
		 
		 	int count = 0;
			int num = n;
			while (n > 0) {
				int r = n % 10;
				if (r != 0 && num % r == 0)
					count++;
				n = n / 10;

			}
			return count;

	}

}
