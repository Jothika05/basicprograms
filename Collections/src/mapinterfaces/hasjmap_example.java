
package mapinterfaces;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hasjmap_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Mobile m1=new Mobile("apple",17,140000);
       Mobile m2=new Mobile("vivo",9,12000);
       Mobile m3=new Mobile("redmi",8,14000);
       Mobile m4=new Mobile("realme",7,17000);
       
       HashMap mob=new HashMap();
       mob.put(1000,m1);   //key,value
       mob.put(1001,m2);
       mob.put(1002,m3);
       mob.put(1003,m4);
       //System.out.println(mob);
       
       Set s=mob.entrySet();
      System.out.println("enteyset:  " +s);
     
     Iterator i=s.iterator();
     while(i.hasNext()) 
     {
    	 Map.Entry me=(Map.Entry) i.next();
    	 Object ol=me.getKey();
    	 Object olDetails=me.getValue();
    	 Mobile mo=(Mobile)olDetails;
    	 if(olDetails.equals(m3))
           //mo.price=(1555555);
    	     mo.gb=(5);
    		//System.out.println(mo.price);
    		  System.out.println(mo.gb);
    	     
     
    	  System.out.println(mo);
     }
     System.out.println(mob);
	}
}