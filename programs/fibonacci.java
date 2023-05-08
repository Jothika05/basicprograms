package programs;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	     System.out.println("enter the number:");
	     int n=sc.nextInt();
	     int a=-1,b=1,c;
	     for(int i=1;i<=n;i++) {
	    	 c=a+b;
	    	 System.out.println(c);
	    	 a=b;
	    	 b=c;
	    	 
	     }
	      
	}

}


