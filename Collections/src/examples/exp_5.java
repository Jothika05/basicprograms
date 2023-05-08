package examples;

import java.util.ArrayList;

public class exp_5 {
//20.add a element at particular index in ArrayList
//21.remove  a element at particular index in ArrayList
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<>();
	    al.add("zaara");
	    al.add("seetha");
	    al.add("kaala");
	    al.add("rama");
	    
	    System.out.println("before add element:"+al);
	    for(String s:al) {
	    	System.out.println(s);
	    }
	      
	    System.out.println("before remove element:"+al);
	    al.remove(3); 
	    System.out.println("after remove element:"+al);
	    
	    al.add(2,"dJ");
	    System.out.println("after add element:"+al);
	    for(String s:al) {
	    	System.out.println(s);
	    }
	    
	}
	
	//18.comparable

}
