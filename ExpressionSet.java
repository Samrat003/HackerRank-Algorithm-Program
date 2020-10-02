package prep;
import java.util.*;
public class ExpressionSet {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				String s=sc.next();
		       Stack<Character> stack = new Stack<Character>();
		       boolean flag=true;
		       for (int i = 0; i < s.length(); i++){
		           if (s.charAt(i) == '(') 
		               stack.push('(');
		           else if (s.charAt(i) == '{')
		               stack.push('{');
		           else if (s.charAt(i) == '[')
		               stack.push('[');
		           else if (s.charAt(i) == ')') {
		               if (stack.isEmpty()) 
		            	   	flag=false;
		               if (stack.pop() != '(') 
		            	   	flag=false;
		           }
		           else if (s.charAt(i) == '}') {
		               if (stack.isEmpty()) 
		            	   	flag=false;
		               if (stack.pop() != '{') 
		            	   	flag=false;
		           }
		           else if (s.charAt(i) == ']') {
		               if (stack.isEmpty()) 
		            	   flag=false;
		               if (stack.pop() != '[') 
		            	   flag=false;
		           }
		       }
		       System.out.println(stack.isEmpty());
		   }

}

