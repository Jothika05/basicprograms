package Collection;

import java.util.Scanner;
import java.util.TreeSet;

public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
      
        TreeSet<Integer> t=new TreeSet<>();
        while(true)
        {
        	  int  n=sc.nextInt();
        	  if(n==-1)
        		  System.exit(0);
        	  else
        		  t.add(n);
                System.out.println(t);
        }
	}

}
