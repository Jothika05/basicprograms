package Collection;

import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList a=new LinkedList();
	     a.add("Nikil");
	     a.add(30);
	     a.add(null);
	     a.add("Nikil");
	     System.out.println(a.get(3));
	     System.out.println(a); 
	     a.set(0, "prakash");
	     a.add(0,"Mr");
	     a.add(0, "m");
	     System.out.println(a); 

	}

}
