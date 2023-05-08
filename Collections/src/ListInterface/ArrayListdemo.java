package ListInterface;

import java.util.ArrayList;
import java.util.List;
/*      ARRAYLIST
 * advantages-->Data retrieval is fast
 * disadvantages-->add,remove difficult
 * 
 */
public class ArrayListdemo {


	public static void main(String args[]) {
   ArrayList al=new ArrayList();
   al.add(10);
   al.add(20);
   al.add(30);
   al.add(40);
   al.add("raadha");
   al.add('c');
   al.add(true);
   al.add("raadha");
   
   System.out.println(" al list"+al);
 /*  System.out.println(al.contains("ram"));
   
   System.out.println(al.get(0));
   System.out.println(al.get(5));
   al.set(5, "abcd");
   System.out.println("index: "+ al.indexOf("raadha"));
   System.out.println("index: "+ al.lastIndexOf("raadha"));
   System.out.println(al.remove(6));
   System.out.println(al);   */
   ArrayList al2=new ArrayList();
   al2.addAll(al);
   System.out.println(" al2 list:"+al2);
   ArrayList al3=new ArrayList();
   al3.add("chennai");
    al3.add("mumbai ");
    al3.add(" newdelhi");
    al3.add("kolkata ");
    System.out.println(" al3 list :"+al3);
     al3.addAll(2, al);
     System.out.println(" al3  addition list:"+al3);
     al3.removeAll(al);
     System.out.println(" al3 remove list:"+al3);
     List al4=al3.subList(0, 3);
     System.out.println(" al4 list:"+al4);
	}	

}
