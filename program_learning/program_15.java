package program_learning;

import java.util.Scanner;

public class program_15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
			}
		System.out.println("Factorial of a number:"+fact);
		
	}


}
