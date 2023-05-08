package ListInterface;

import java.util.LinkedList;
/* 
 *   LINKEDLIST
 * advantages-->add,remove easy[insertion,deletion]
 * disadvantages-->Data retrieval is slow
 */

public class linkedlistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    LinkedList l=new LinkedList();
    l.add( 5);
    l.add(10);
    l.add("nithiya");
    l.add("raja");
    l.add(true);
    l.add('c');
   // System.out.println(l);
    l.addFirst(100);
    System.out.println(l);
    System.out.println("after poll"+ l.poll());
    System.out.println(l);
    l.offer(5000);
    System.out.println("after offer"+l);
  //  l.clear();
   // System.out.println("after clear"+l);
    
    LinkedList l2=(LinkedList) l.clone();
    System.out.println("clone object"+l2);
    
    
    
	}

}

