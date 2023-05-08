package programs;

import java.util.Scanner;
/*
public class Factorial {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number:");
    int n=sc.nextInt();
	int fact=1;
	for(int i=1;i<=n;i++) {
	fact=fact*i;	
	}
   System.out.println("the factorial of is "+ fact);
	}

} }  */

public class Factorial{
static int factorial(int n){
	 if(n==0)
		 return 1;
	 else
		 return(n*factorial(n-1));

 }

public static void main(String[] args) {

    int i,fact=1;
 
    Scanner sc=new Scanner(System.in);
	System.out.println("enter the number1:");
    int n=sc.nextInt();
    fact=factorial(n);
    System.out.println("factorial of " +fact);
	}
}