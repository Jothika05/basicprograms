package Arraylearning;

import java.util.*;

public class integercomparator {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=new ArrayList<Integer>();
		l.add(234);
		l.add(45);
		l.add(321);
		l.add(2);
		l.add(26);
		l.add(17);
		
	/*	Collections.sort(l);
		for(int i: l) {
			System.out.println(i);
		}   */
		 
		 System.out.println("before sorting:" +l);
          for(int i: l) {
			System.out.println(i);
		}
          
		 Collections.sort(l, new integercomparatorDemo());
		  System.out.println("after sorting:" +l);
		  for(int i: l) {
				System.out.println(i);
			}
		} 
}


