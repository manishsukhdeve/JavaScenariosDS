package HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap m = new HashMap();
//		LinkedHashMap m = new LinkedHashMap();
		
		m.put("Nitin", 700);
		m.put("Atul", 800);
		m.put("Durga", 200);
		m.put("Sumit", 500);
		System.out.println(m);	// {Nitin=700, Atul=800, Durga=200, Sumit=500}
		System.out.println(m.put("Nitin", 1000));	// 700
		
		Set s = m.keySet();
		System.out.println(s);	// [Nitin, Atul, Durga, Sumit]
		
		Collection c = m.values();
		System.out.println(c);	// [1000, 800, 200, 500]
		
		Set s1 = m.entrySet();
		System.out.println(s1);	// [Nitin=1000, Atul=800, Durga=200, Sumit=500]
				
		Iterator itr = s1.iterator();
		while (itr.hasNext()) {
			Map.Entry m1 = (Map.Entry)itr.next();
			System.out.println(m1.getKey() + "..." + m1.getValue());
			if (m1.getKey().equals("Sumit")) {
				m1.setValue(10000);
			}
		}
		System.out.println(m);	
	}
}
