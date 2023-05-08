package Generics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class charcount {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
    String s="vishalsubburam";
    HashMap<Character,Integer> hm=new HashMap<Character, Integer>();
    System.out.println(hm);
    char[] ch=s.toCharArray();
    for(char c:ch) {
   	// System.out.println(c);
   	 
   	 if(hm.containsKey(c)){
   		 hm.put(c,hm.get(c)+1);
   	 }
   	 else
   	 {
   		 hm.put(c, 1);
   	 }
    }
    System.out.println(hm);
    
    Set<Map.Entry<Character,Integer>> s1=hm.entrySet();
    
    for(Map.Entry<Character,Integer> entry:s1)  {
   	    if(entry.getValue()>1)
   	        System.out.println(entry.getKey()+" : "+ entry.getValue());
            }
    
    
	}

}



