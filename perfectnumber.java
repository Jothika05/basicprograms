package basicprograms;

import java.util.Scanner;

public class perfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Scanner sc=new Scanner(System.in);
	       System.out.println("enter the number:");
	       int n=sc.nextInt();
	       int sum=0;
	       for(int i=1;i<n;i++) {
	    	   if(n%i==0) {
	    		   sum=sum+i;
	    	   }
	       }
	      if(sum==n) {
	    	  System.out.println(n +"is perfectnumber");
	      }
	      else{
	    	  System.out.println(n + "is not a perfect number");
	      }
	}

}
