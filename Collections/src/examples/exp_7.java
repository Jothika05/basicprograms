package examples;

import java.util.*;

public class exp_7 {
//22.convert linkedlist to arrayList
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*    LinkedList<String> ll=new LinkedList<String>();
    ll.add("briyani");
    ll.add("noodles");
    ll.add("pongal");
    ll.add("boori");
    
    List<String>l=new ArrayList(ll);
    for(String s:l) {
    	System.out.println(s);
    }
  */  
 //23.convert hashset to array
    
 /*   HashSet<String> hs=new HashSet<String>();
    hs.add("apple");
    hs.add("orange");
    hs.add("mango");
    hs.add("banana");
    
    
    String[] fruits=hs.toArray(new String[hs.size()]);
    for(String s:fruits) {
    	System.out.println(s);
    }
    */

//24.reverse arraylist
		
/*		ArrayList<String> ll=new  ArrayList<String>();
		    ll.add("briyani");
		    ll.add("noodles");
		    ll.add("pongal");
		    ll.add("boori");
        System.out.println("before"+ll);
    
        Collections.reverse(ll);
        System.out.println("after"+ll);
    
  */
		
//25.iterate treemap
		TreeMap<String,Integer>t=new TreeMap<String, Integer>();
		
    t.put("apple", 100);
    t.put("mango",80);
    t.put("kova",85);
    t.put("orange",110);
    
    
   Set<Map.Entry<String,Integer>>me= t.entrySet();
   Iterator i=me.iterator();
   while(i.hasNext()) {
	   Map.Entry m=(Map.Entry)i.next();
	   System.out.println(""+m.getKey()+" "+m.getValue());
   }
   
   
   
   
   
   
   
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	}

}
