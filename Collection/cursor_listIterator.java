package Collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class cursor_listIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          LinkedList l=new LinkedList();
          l.add("Nikil");
          l.add("Prakash");
          l.add("isCool");
          System.out.println(l);
          
          ListIterator li=l.listIterator();
          while(li.hasNext()) {
        	 String s= (String) li.next();
        	 if(s.equals("isCool"))
        		 li.add("Boy");
        	 if(s.equals("Nikil"))
        		 li.set("Mr.Nikil");
          }
         
          System.out.println(l);
  
	}

}
