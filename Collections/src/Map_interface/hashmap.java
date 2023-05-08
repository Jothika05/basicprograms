package Map_interface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashMap<String, Integer> hm=new HashMap<String, Integer>();
	
       hm.put("varun",1 );
       hm.put("kala",2);
       hm.put("sheela",3);
       hm.put("surya",4);
       hm.put("zaara",5);
       System.out.println(hm);
      
       Set<String> s=hm.keySet();
       System.out.println("keys are"+s);
       
       Collection<Integer> c= hm.values();
       System.out.println("values are" +c);
       
       Set s1=hm.entrySet();
       System.out.println("entries are"+s1);
       
       Iterator i=s1.iterator();
       while(i.hasNext()) {
    	   Map.Entry me=(Map.Entry)i.next();
    	  //System.out.println(i.next());
    	  // System.out.println(me.getKey());
    	   System.out.println(me.getKey()+" : " +me.getValue());
    	 //  System.out.println(me.getValue());
           if(me.getKey().equals("surya")){
    		   me.setValue(200);
    		  System.out.println(me); 
    	   }
       }
       System.out.println(hm);
	}
}
