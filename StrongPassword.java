package prep;
import java.util.*;
public class StrongPassword {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
		String special = "!@#$%^&*()-+";
		Boolean digit=false, lowerCase=false, upperCase=false, specialChar=false;
	
			for(int i=0;i<str.length();i++) {
				char c=str.charAt(i);
				if(c>='0' && c<='9'){
					digit=true;
				}
				if(c>='a' && c<='z') {
					lowerCase=true;
				}
				if(c>='A' && c<='Z') {
					upperCase=true;
				}
				if(special.indexOf(c)!=-1){
					specialChar=true;
				}
				
			}
				
		int digitCount=0,lowerCount=0,upperCount=0,specialCount=0,total=0;
		
		if(!digit==true) {
			digitCount++;
		}
		if(!lowerCase==true) {
			lowerCount++;
		}
		if(!upperCase==true) {
			upperCount++;
		}
		if(!specialChar==true) {
			specialCount++;	
		}
		
		total=digitCount+lowerCount+upperCount+specialCount;
		if(str.length()<6) {
			System.out.println(6-str.length());
		}else {
			System.out.println(total);
		}
	

	}

}
