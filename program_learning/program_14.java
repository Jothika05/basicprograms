package program_learning;

import java.util.Scanner;

public class program_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum=sum+i;
			}
		System.out.println("Sum of Natural number is:"+sum);
		
	}

}

