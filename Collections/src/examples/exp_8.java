package examples;

import java.util.*;
import java.util.Map.Entry;


public class exp_8 {
//26.sort hashmap by key
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashMap<String,Integer> hm=new HashMap<>();
     hm.put("deva", 101);
     hm.put("xxx", 105);
     hm.put("pavi", 102);
     hm.put("zara", 103);
     
  /*  System.out.println("before sorting by keys:");
     Set s= hm.entrySet();
     Iterator i=s.iterator();
     while(i.hasNext()) {
    	 Map.Entry e=(Map.Entry)i.next();
    	 System.out.println(e.getKey()+ ":" +e.getValue() +" ");
     }
     
     TreeMap<String,Integer>t=new TreeMap(hm);
     System.out.println("After sorting by keys:");
     Set s1= t.entrySet();
     Iterator i1=s1.iterator();
     while(i1.hasNext()) {
    	 Map.Entry e1=(Map.Entry)i1.next();
    	 System.out.println(e1.getKey()+ ":" +e1.getValue() +" ");
     }
     //System.out.println(hm);
  */
     
     
//sorted hashmap by values
    System.out.println("before sorting by values:");
    Set s= hm.entrySet();
    Iterator i=s.iterator();
    while(i.hasNext()) {
   	 Map.Entry e=(Map.Entry)i.next();
   	 System.out.println(e.getKey()+ ":" +e.getValue() +" ");
    }
    
   
}
}
	
