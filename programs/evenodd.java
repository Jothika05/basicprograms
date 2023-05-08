package programs;

import java.util.Scanner;

public class evenodd {

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int e=0,o=0;
		 Scanner sc=new Scanner(System.in);
	     System.out.println("enter the limit:");
	     int n=sc.nextInt();
	     int a[]=new int[n];
	     for(int i=0;i<n;i++)
	     {
	    	 System.out.println("enter a value of a["+i+"]: ");
	    	 a[i]=sc.nextInt();
	     }
	     for( int element : a)
	     {
	    	if(element%2==0) {
	    		e++;
	    	
	    	}
	    	else
	    	{
	    		o++;
	    	}
	    	
	     }	
	    	System.out.println("total number of even number is" + e);
	    	System.out.println("total number of odd number is" + o);
	     }
	}
*/

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	     System.out.println("enter the number:");
	     int n=sc.nextInt();
	   if(n%2==0)
	   {
		   System.out.println(n +"is even number");
	   }
	   else
	   {
		   System.out.println(n +"is odd number");   
	   }
	}
}
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     