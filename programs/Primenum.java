package programs;

import java.util.Scanner;

public class Primenum {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
		     int  f=0;
		     for(int n=1;n<=25;n++) {
		    	 for(int i=1;i<=n;i++) {
			        if(n%i==0) {
				    f++;
		    	 }
		   }
		   if(f==2) {
		     System.out.println( n +"is prime number");
		   }
	      f=0;
	}
  } 
}
