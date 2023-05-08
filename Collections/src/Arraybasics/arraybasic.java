package Arraybasics;

import java.util.Arrays;
import java.util.Comparator;

public class arraybasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int[] a= {10,20,30,40};
	 int[] b={10,30,40,20};
	 System.out.println(Arrays.equals(a,b));
     System.out.println("********************************");
     Arrays.sort(b);
     for (int i:b) {
	      System.out.println(i);
        }
     System.out.println("*************Normal sorting*******************");
     
     String[] name= {"vishalbhartathi","suryapriyan","nithyasri","suresh","arun","bharath"};
     Arrays.sort(name);
     for (String s:name) {
	      System.out.println(s);
      }
     System.out.println("*********** Comparator sorting*********************");
     comparatordemo cd=new  comparatordemo();
     Arrays.sort(name, cd);
     for (String s:name) {
	      System.out.println(s);
       }
     System.out.println("********************************");
     
     
     
    	}

}
