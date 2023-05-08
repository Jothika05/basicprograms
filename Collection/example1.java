package Collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class example1 {
     public static String function(String s) {
		
    	 for(int i=0;i<s.length();i++) {
    		 if(Character.isLetter(s.charAt(i)))
    			 continue;
    		 else
    		 {
    			 System.out.print(-1);
    			 System.exit(0);
    		 }
    	 }
    	 
    	 LinkedHashMap<Character,Integer> l=new LinkedHashMap<>();
    	 for(int i=0;i<s.length();i++) 
    	 {
                 l.put(s.charAt(i),l.getOrDefault(s.charAt(i),0)+1);
         }
    	 String res=" ";
    	 for(Map.Entry<Character, Integer> e:l.entrySet())
    	 {
    		 res+=e.getKey();
    		 res+=e.getValue();
    	 }
    	 return res;
     } 	 
    	 
    	 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(function(s));
        
	   }
}
