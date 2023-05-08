package Setinterface;

import java.util.ArrayList;
import java.util.Scanner;

public class Stringinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	       System.out.println("Enter the limit");
	       int l=sc.nextInt();
	       ArrayList al = new ArrayList();
	       System.out.println("Enter the string");
	       for(int i=1;i<=l;i++) {
	       String a=sc.next();
	        al.add(a);
	       }
	       System.out.println(al);
	       }
	

}


