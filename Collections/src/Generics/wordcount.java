package Generics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class wordcount {

	public static void main(String[] args) {
	
		    String names="raja mala kala raja mala maahi";
		    String[] words=names.split(" ");
		    HashMap<String,Integer> wordcountmap=new HashMap<String, Integer>();
		    System.out.println(wordcountmap);
		
		    for(String word:words) 
		    {
		     if(wordcountmap.containsKey(word))
		     {
		   		wordcountmap.put(word,wordcountmap.get(word)+1);
		   	 }
		   	 else
		   	 {
		   		 wordcountmap.put(word, 1);
		   	 }
		    }
		    System.out.println(wordcountmap);
		    
		    Set<Map.Entry<String,Integer>> s1=wordcountmap.entrySet();
		    
		    for(Map.Entry<String,Integer> entry:s1)  {
		   	    if(entry.getValue()>1)
		   	        System.out.println(entry.getKey()+" : "+ entry.getValue());
		            }
		    
	}
}
