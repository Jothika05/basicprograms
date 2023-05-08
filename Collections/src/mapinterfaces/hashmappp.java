package mapinterfaces;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class hashmappp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashMap hm=new HashMap();
     hm.put("mango" ,100 );
     hm.put( "apple" ,140 );
     hm.put("orange"  ,80 );
     hm.put( "banana" ,110 );
     //System.out.println(hm);
    
    Collection c= hm.values();     
    System.out.println(c);
    
     Set s1=hm.keySet();
     System.out.println(s1);

     Set s= hm.entrySet();
     System.out.println(s);
     
    Iterator i=s.iterator();
    while(i.hasNext()) {
    	 System.out.println(i.next());
    }
  /* HashMap hm1=new HashMap();
     hm1.putAll(hm);
     System.out.println(hm1.size());
     System.out.println(hm1.isEmpty());
     hm1.clear();
     System.out.println(hm1.isEmpty());
     
     System.out.println( hm1.get("orange"));
     System.out.println(hm1.containsKey("bjh"));
     System.out.println(hm1.containsValue(100));
     System.out.println(hm1.remove("apple"));
     System.out.println(hm1);
     System.out.println(hm1.remove("banana", 110));
     System.out.println(hm1);  */
	}

}
