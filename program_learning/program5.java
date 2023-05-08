package program_learning;

import java.util.Scanner;

public class program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the dividend");
		int num1=sc.nextInt();
		System.out.println("enter the divisor");
		int num2=sc.nextInt();
		int quotient=num1/num2;
		int remainder=num1%num2;
		System.out.println("Quotient is: "+quotient);
		System.out.println("Remainder is: "+remainder);
		

	}

}
