package prep;

import java.util.*;
import java.util.Map.Entry;

public class MyMap {
	public static void main(String a[]) {
		
		Map<String,Integer> m=new HashMap<>();
		
		m.put("One",1);
		m.put("Two",2);
		m.put("Three",3);
		m.put("five",3);
		
		
		m.putIfAbsent("One",50);
		
		System.out.println(m);
		
		for(Entry<String,Integer> entry:m.entrySet()) {
			entry.setValue((entry.getValue()*100));
		}
		
		System.out.println(m);
	}
}
