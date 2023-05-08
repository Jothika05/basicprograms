package program_learning;

import java.util.Scanner;

public class program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		if(num%2==0)
			System.out.println("Even number");
		else
			System.out.println("Odd number");

	}

}
