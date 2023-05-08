package Generics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class genericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s="amamamamama";
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
    
     }
     
     
	}



