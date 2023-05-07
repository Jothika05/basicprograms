package basicprograms;

import java.util.Scanner;

public class Calculatorswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		System.out.println("enter the operator(+,-,*,/,%):");
		char op=sc.next().charAt(0);
		int c;
	
		switch(op) {
		case '+': 
			c=a+b;
			System.out.println("addition is" +c);
			break;
		case '-': 
			c=a-b;
			System.out.println("subtraction is" +c);
			break;
		case '*': 
				c=a*b;
				System.out.println("multiplication is" +c);
				break;
		case '/': 
			c=a/b;
			System.out.println("divison is" +c);
			break;
		case '%': 
			c=a%b;
			System.out.println("moduls is" +c);
			break;
	default:
		System.out.println("invalid operator");
				
	}

}
}