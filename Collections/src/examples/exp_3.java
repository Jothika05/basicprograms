package examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class exp_3 {
//17.sort hashmap by keys
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> h=new HashMap<String,String>();
		h.put("arul","5" );
		h.put("aruna","6" );
		h.put("aadhi","7" );
		h.put("bharath","8" );
		 System.out.println("Before sorting");
		 for(String s:h.keySet()) {
			 System.out.println(s+" "+h.get(s)); 
		 }
		 
		TreeMap t=new TreeMap();
		t.putAll(h);
		System.out.println("After sorting");
		Set<Map.Entry<String,String>>me= t.entrySet();
		Iterator i=me.iterator();
		while(i.hasNext()) {
			Map.Entry e=(Map.Entry)i.next();
			System.out.println("" +e.getKey()+" "+e.getValue());
		}
	}

}
