package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;



public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println();
        LinkedHashSet<Character> h=new LinkedHashSet<>();
        for(int i=s.length()-1;i>=0;i--) {
        	h.add(s.charAt(i));
        }
         Iterator i=h.iterator();
         while(i.hasNext()) {
        	 System.out.print(i.next());
         }
        
        //System.out.println(h);
	}

}
