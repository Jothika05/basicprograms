package examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class exp_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.
		
  /*    ArrayList al=new ArrayList();
      al.add(2);
      al.add(4);
      al.add(6);
      al.add(7);
      al.add(10);
      al.add("tata");
      System.out.println(al);
   
      for( Object o:al) {
    	  System.out.println(o);  
      } */
		
//2.convert List to Array
		
/*	   ArrayList<String> animal=new ArrayList<String>();
		animal.add("lion");
		animal.add("tiger");
		animal.add("dog");
		animal.add("horse");
		animal.add("cat");
		
		
		String[] aninames=animal.toArray(new String[animal.size()]);
		 for(String s:aninames) {
	    	  System.out.println(s);  
	      }  
*/		
		
//3.traverse or iterate(Hashset)		
/*		HashSet<String> hs=new HashSet<String>();
		hs.add("rama");
		hs.add("seetha");
		hs.add("bala");
		hs.add("mala");
		
	//using foreach loop
		for(String s:hs) {
	    	  System.out.println(s);  
	      }  
		
	//using iterator
		Iterator i=hs.iterator();
		while(i.hasNext()) {
			 System.out.println(i.next());
		}
*/	
		
//4.chect if element exists in Arraylist
		
/*		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(8);
		a.add(3);
		a.add(4);
		a.add(2);
		a.add(6);
		if(a.contains(8)) {
			System.out.println("given element is found");
		}
		else {
			System.out.println("given element doesnt  found");
				
		}
*/

//5. chect if element exists in hashset
/*		HashSet<Integer> hm=new HashSet<Integer>();
		hm.add(3);
		hm.add(5);
		hm.add(9);
		hm.add(8);
		hm.add(2);
		if(hm.contains(8)) {
			System.out.println("given element is found");
		}
		else {
			System.out.println("given element doesnt  found");
				
		}
	}

*/
//6.<HashMap<String,String> hm=new HashMap<String,String>();
//7.ArrayList<String> al=new ArrayList<String>();		
		
//8.convert Array To List
/*		String[] friuts= {"apple","orange","pineapple"};
		ArrayList<String> al=new ArrayList<String>();
		al.add("kova");
		al.add("mango");
	

		for(int i=0;i<friuts.length;i++) {
			al.add(friuts[i]);
		}
		for(String s:al) {
			System.out.println(s);
		}
	*/	
//9. find length of arrayList
/*		
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("kova");
		al1.add("mango");
		System.out.println(al1.size());
*/
//10.add given elements to the HashMap to key and value is String
/*		HashMap<String,String> h=new HashMap<String,String>();
		h.put("tamil","100");
		h.put("english", "80");
		h.put("maths","99");
		h.put("science", "95");
		h.put("social", "100");
		System.out.println(h);
*/		
//11.HashSet<Integer>hm=new HashSet<Integer>();		
		
//12.add elements in arraylist
/*		 ArrayList al=new ArrayList();
	      al.add(20);
	      al.add(40);
	      al.add(60);
	      al.add(70);
	      al.add(100);
	      
	      System.out.println(al);
*/	      
//13.add elements in hashset
/*	      HashSet<Integer>hm=new HashSet<Integer>();
	      hm.add(4);
	      hm.add(5);
	      hm.add(6);
	      hm.add(7);
	      hm.add(8);
	      for(int i:hm) {
	    	   System.out.println(i);
	 	      
	      }
*/
//14,15.find size of hashmap,and hashmap is empty or not
	      HashMap<String,String> h=new HashMap<String,String>();
			h.put("tamil","100");
			h.put("english", "80");
			h.put("maths","99");
			h.put("science","60");
			 System.out.println(h.size());
			 h.clear();
			 System.out.println(h.isEmpty());
		
	}

}
		
		
		
		
		
		
		
		
		
