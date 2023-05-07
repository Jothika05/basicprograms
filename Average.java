package basicprograms;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit");
		int n=sc.nextInt();
		
		int avg = 0 , sum=0;
		for(int i=1;i<=n;i++) {
			System.out.println("enter the number");
			int a=sc.nextInt();
		    sum=sum+a;
		    avg=sum/n;
	}
		System.out.println("total is:" + sum);
		System.out.println("average is:" + avg);
}
}