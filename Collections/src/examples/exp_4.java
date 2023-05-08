package examples;

import java.util.ArrayList;
import java.util.Collections;

public class exp_4 {
//19.sort arraylist in decending order
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   /* ArrayList<Integer> al=new ArrayList<>();
    al.add(34);
    al.add(3);
    al.add(39);
    al.add(22);
    System.out.println("before Sorting:");
    for(int i:al) {
    	System.out.println(i);
    }
    
    Collections.sort(al,Collections.reverseOrder()) ;
    System.out.println("After Sorting:");
    for(int i:al) {
    	System.out.println(i);
	} */
		ArrayList<String> al=new ArrayList<>();
	    al.add("zaara");
	    al.add("seetha");
	    al.add("kaala");
	    al.add("rama");
	    System.out.println("before Sorting:");
	    for(String s:al) {
	    	System.out.println(s);
	    }
	    
	    Collections.sort(al);
	    // System.out.println(al);
	    Collections.reverse(al);
	      //System.out.println(al);
	    System.out.println("After Sorting:");
	    for(String str:al) {
	    	System.out.println(str);
	}
}
}