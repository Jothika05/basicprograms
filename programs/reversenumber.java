package programs;

import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     System.out.println("enter the number:");
	     int n=sc.nextInt();
	     int rev=0,rem;
        while(n!=0)
	     {
	    	 rem=n%10;
	    	 rev=rev*10+rem;
	    	 n=n/10;
	     }
	     System.out.println("reverse number is  " +rev);
	}

}
