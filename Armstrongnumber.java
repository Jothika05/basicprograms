package basicprograms;

import java.util.Scanner;

public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int rem,sum=0,temp;
		temp=n;
		while(n!=0) {
			rem=n%10;
			sum=sum+rem*rem*rem;
			n=n/10;
			
		}
     if(sum==temp)
    	 System.out.println(temp + " is a armstrong number");
     else
    	 System.out.println(temp + " is not  a armstrong number");
	}

}
