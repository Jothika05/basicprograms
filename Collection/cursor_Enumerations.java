package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class cursor_Enumerations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Vector v=new Vector();
		 for(int i=0;i<=10;i++)
			 v.addElement(i);
         System.out.println(v);
         
         Enumeration e=v.elements();
         while(e.hasMoreElements()) {
        	 Integer I=(Integer) e.nextElement();
        	 if(I%2==0)
                 System.out.println(I+" "); 
         }
         System.out.println(v);

	}

}