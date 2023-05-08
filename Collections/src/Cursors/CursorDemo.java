package Cursors;

import java.util.*;

public class CursorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList names=new ArrayList();
  names.add("vishal");
  names.add("surya");
  names.add("karthick");
  names.add("nithiya");
  names.add("rani");
  names.add("arun");
  names.add(5);
  names.add(6);
  System.out.println("before "+names);
  System.out.println();
/*  for(Object s:names) { // String==>Type mismatch: cannot convert from element type Object to String
	  System.out.println(s);  
  } */
  System.out.println("*********USING ITERATOR*************");
  Iterator i= names.iterator();
  while(i.hasNext()) {
	 if(i.next().equals("surya"))
		  i.remove();
	 // System.out.println(i.next());
	  //i.remove();
	}
  System.out.println("After using iterator:"+names); 
  System.out.println();
  
  System.out.println("*********USING LISTITERATOR*************");
  ListIterator l= names.listIterator();
  l.add("raja");
  while(l.hasNext()) 
  {
	  if(l.next().equals(6)) {
		  l.set(100); 
	  }

  }
  System.out.println("After using listiterator:"+names);
}
}
