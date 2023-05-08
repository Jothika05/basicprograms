package Collection;

import java.util.HashSet;

public class set_Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashSet  h=new HashSet();
        h.add("A");
        h.add("B");
        h.add("C");
        h.add("Z");
        h.add(null);
        h.add(10);
        System.out.println(h);
        System.out.println(h.add(10));
        System.out.println(h.add("Z"));
        System.out.println(h);



	}

}
