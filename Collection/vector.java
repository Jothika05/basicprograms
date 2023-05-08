package Collection;

import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Vector<Integer> v=new Vector();
		 System.out.println(v.size()); //0
		 System.out.println(v.capacity());//10
		 for(int i=1;i<=10;i++) 
			 v.add(i);
		 System.out.println(v);

		 System.out.println(v.capacity());//10
          v.add(11);
		 System.out.println(v.capacity()); //20
		 System.out.println(v.contains(11)); 
		 

		 
	}

}
