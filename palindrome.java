
package basicprograms;

import java.util.Scanner;

public class palindrome {
/*
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
        int temp;
        temp=n;
        int ispalindrom=0,rem;
        while(n!=0) {
        	rem=n%10;
        	ispalindrom=ispalindrom *10+rem;
        	n=n/10;
        	
        }
        if(temp==ispalindrom) {
        	System.out.println(temp + "  is  palindrome number");
        	
        }
        else {
        	System.out.println(temp + " is   not apalindrome number");
        }
	}

}
*/
	

  public static void main(String[] args) {

  Scanner sc=new Scanner(System.in);
  System.out.println("enter the string:");
  String s=sc.next();
  String reverse ="";
  
     for(int i=s.length()-1;i>=0;i--) {
	 reverse=reverse+s.charAt(i);
         }
    System.out.println(reverse);
  
  if(s.equals(reverse))
	  System.out.println("palindrome");
  else 
	System.out.println(" not a palindrome number");
}
}