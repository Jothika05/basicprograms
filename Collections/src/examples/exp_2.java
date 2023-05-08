package examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class exp_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//16.iterate the HashMap
		HashMap<String,String> h=new HashMap<String,String>();
		h.put("arul","5" );
		h.put("aruna","6" );
		h.put("aadhi","7" );
		h.put("bharath","8" );
        System.out.println(h);
     //keyset,foreach loop
		/*for(String s:h.keySet()) {
			 System.out.println("key:"+s+" value:" +h.get(s));
		} */
      
      //keyset(),iterator
    /*  Set s=h.keySet();
        Iterator i= s.iterator();
         while(i.hasNext()) {
    	   String k=(String) i.next();
    	   System.out.println("key:"+k+" value:" +h.get(k));
      }
    */
      
        //entryset,foreach
     /*  Set<Map.Entry<String,String>> me= h.entrySet();
         for(Map.Entry m:me) {
	      System.out.println("key:" +m.getKey()+" value:"+m.getValue());
	      }
	 */
        
        //entryset,iterator
        Set<Map.Entry<String,String>> me= h.entrySet();
        Iterator i= me.iterator();
        while(i.hasNext()) {
	     Map.Entry e=(Entry) i.next();
	     System.out.println("key:" +e.getKey()+" value:"+e.getValue());
        }
	  
	 }
	}

