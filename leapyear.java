package basicprograms;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year");
		int year=sc.nextInt();
		if( (year%400==0) || (year%4==0)  &&(year%100!=0) ) {
		//if(year%4==0 || year%100==0 && year%400==0) {
			System.out.println(year + "is leap year");
	    }
	   
		else {
			System.out.println(year +" is not a leap year");
		}
}
}


