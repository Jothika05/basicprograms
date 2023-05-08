package programs;

import java.util.Scanner;

public class Strongnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int originalNum,rem,fact,sum=0;
		 Scanner sc=new Scanner(System.in);
	     System.out.println("enter the number:");
	     int n=sc.nextInt();
	     originalNum=n;
	     while(n>0)
	     {
	    	 rem=n%10;
	    	 System.out.println(rem);
	    	 fact=1;
	    	 for(int i=1;i<=rem;i++)
	    	 {
	    		 fact=fact*i;
	    	 }
	    	 System.out.println("factorial is" + fact);
	    	 sum=sum+fact;
	    	 n=n/10;
	     }
	     
	
	     if(sum==originalNum) {
	    	  System.out.println(originalNum +"is strong number");
	      }
	      else
	      {	    	 
	    	  System.out.println(originalNum + "is not a strong number");
	      }
	}   

}
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
