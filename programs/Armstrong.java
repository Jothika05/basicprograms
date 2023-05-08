package programs;

import java.util.Scanner;

public class Armstrong {


		public static void main(String[] args) {   
		                                           
		                                          
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
	    int n=sc.nextInt();
	    int rem,sum=0;
	    int temp=n;
	    
	    while(n!=0)
	     {
	    	 rem=n%10;
	    	 sum=sum+rem*rem*rem;
	    	 n=n/10;
	     }
	    if(sum==temp)
	    	System.out.println(temp+ "is a armstrong number");
	    else
	    	
	         System.out.println(temp+ "is a  not a armstrong number");
            }
	}
