package basicprograms;

import java.util.Scanner;

public class Amongthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		System.out.println("enter the third number");
		int c=sc.nextInt();
		if(a>b && a>c) {
			System.out.println("greatest number is "+ a);
		}
		else if(b>c) {
			System.out.println("greatest number is "+b);
		}
		else {
			System.out.println("greatest number is"+ c);
		}
	}

}
