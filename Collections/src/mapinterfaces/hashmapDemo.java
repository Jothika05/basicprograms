package mapinterfaces;

import java.util.*;

public class hashmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<String, Integer> hm=new HashMap<String, Integer>();
	     hm.put("Nellai Express",1900);
	     hm.put("Mannai Express",2000 );
	     hm.put("Mumbai Express",2100 );
	     hm.put("Vaigai Express",2100 );
	     System.out.println(hm);
	     
	     Set<String> s1=hm.keySet();
	     System.out.println("keys are :"+s1);
	       
	     Collection<Integer> c= hm.values();
	     System.out.println("values are :" +c);
	     
	     Set s= hm.entrySet();
	     System.out.println("before entryset  :"+s);
	     
	     Iterator i=s.iterator();
	      while(i.hasNext()) {
	    	 Object o=i.next();
	    	 Map.Entry e=(Map.Entry) o;
	    	 Object time=e.getValue();
    	     Object expname=e.getKey();
    	    if(expname.equals("Vaigai Express")) 
    	    {
	    		 e.setValue(2130);
	    	}
    	    System.out.println(e.getKey()+" :"+ e.getValue());
	        }
	    	 System.out.println("after entryset  :"+s);
	    	
	    	 
	}
}
