package Setinterface;

import java.util.ArrayList;
import java.util.Scanner;

public class userinput {



		  public static void main(String[] args) {
		 
		     /*   Scanner sc = new Scanner(System.in);
		        ArrayList<Integer> al = new ArrayList<>();
		        System.out.println("Enter the number ");
		        
		        while(sc.hasNextInt()) {
		          al.add(sc.nextInt());
		        }
		        System.out.println(al);
		  } } */

	
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the limit");
            int l=sc.nextInt();
            ArrayList<Integer> al = new ArrayList<>();
            System.out.println("Enter the number ");
            for(int i=0;i<l;i++)
            {
               al.add(sc.nextInt());	
                }
             for(int i:al) {
	           System.out.println(i);	
              } 

     
}




}















