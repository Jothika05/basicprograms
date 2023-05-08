package Collection;

import java.util.HashMap;
import java.util.Map;

public class hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  /* HashMap hm=new HashMap();
   hm.put(null, null);
   hm.put(1,"Mohan" );
   hm.put(2,"Nikil" );
   hm.put(3,"Mohan" );
   hm.put(4,"RAm" );
  System.out.println(hm); */
		   HashMap<String,Integer> hm=new HashMap<>();
		   hm.put("apple", 70);
		   hm.put(  "bread" ,40 );
		   hm.put("wheat",90 );
		   hm.put("oil" ,100 );
		   hm.put(  "jam" , 50);
		   System.out.println(hm); 
		  // hm.forEach((k,v)->System.out.println(k+" :"+v)); 
		   for(Map.Entry<String,Integer> e:hm.entrySet()){
			   String key=e.getKey();
			   int value=e.getValue();
			   System.out.println(key+"="+value);

		   }

	}

}
