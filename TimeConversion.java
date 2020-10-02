package prep;

import java.util.*;

public class TimeConversion {

	public static void main(String[] args) {
		
		   long start = System.currentTimeMillis();;
		    new TimeConversion();
		    long end = System.currentTimeMillis();;
		
		Scanner sc =new Scanner(System.in);
		String s=sc.next();
		int hour=(Integer.parseInt(String.valueOf(s.charAt(0))))*10+(Integer.parseInt(String.valueOf(s.charAt(1))));
		String time=s.substring(8).toUpperCase();
		String time2=s.substring(2,8);
		if(time.equals("PM") && (hour>12 || hour<12)) {
			int h=hour+12;
			String hours=String.valueOf(h);
			String t=hours+time2;
			System.out.println(t);
		}else if(hour==12 && time.equals("PM")) {
			String sp="12";
			System.out.println(sp+time2);
		}
		else {
			if(hour==12) {
				String st="00"+time2;
				System.out.println(st);
			}else {
				String time3=s.substring(0,8);
				System.out.println(time3);
			}
			
		}
//		else {
//			String time3=s.substring(0,8);
//			System.out.println(time3);
//		}
		
		 System.out.println((end - start) + " ms");
		
	}

}
