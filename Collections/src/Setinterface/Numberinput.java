package Setinterface;

import java.util.ArrayList;
import java.util.Scanner;

public class Numberinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Integer> al=new ArrayList<Integer>();
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the limit");
     int l=sc.nextInt();
     System.out.println("enter the number");
     int n=sc.nextInt();
   /* while(n!=0) {
    	 al.add(n);
    	 n=sc.nextInt();
    	 }  */
    for(int i=0;i<l;i++) {
    	 al.add(n);
    	 n=sc.nextInt();
    	 }

     
     for(int a:al) {
    	 System.out.println(a);
     }
     System.out.println("enter would u like to delete the number");
   
      int del=sc.nextInt();
      for(int i=0;i<l;i++) {
    	  if(al.get(i)==del) {
    		  al.remove(i);
    		  break;
    	  }
    		  }
      for(int a:al) {
     	 System.out.println(a);
      
      }
	
}
}
