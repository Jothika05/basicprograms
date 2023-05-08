package program_learning;

import java.util.Scanner;

public class program_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a ,b,c");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double d=b*b-4*a*c;
		double r1,r2;
		System.out.println("value of d is:"+d);
		if(d>0) {
			r1=(-b+Math.sqrt(d))/(2*a);
			r2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("roots are real \n"+"root1=" +r1+"   "+ "root2=" +r2 );
		}
		else if(d==0) {
			r1=-b/(2*a);
			r2=-b/(2*a);
			System.out.println("roots are equal \n"+"root1=root2="+r1+" "+r2);
		}
		else {
			double realpart=-b/2*a;
			double imaginarypart=Math.sqrt(-d)/(2*a);
			System.out.println("roots are imaginary\n"+"realpart=" +realpart+ "  and "+"imaginarypart="+imaginarypart);	
		}
		}
  	}
