package Collection;

import java.util.LinkedHashSet;

public class set_linkedHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  LinkedHashSet h=new LinkedHashSet();
  h.add("A");
  h.add("B");
  h.add("C");
  h.add("Z");
  h.add(null);
  System.out.println(h);
  System.out.println(h.add(10));
  System.out.println(h.add("Z"));
  System.out.println(h);

  
	}

}
