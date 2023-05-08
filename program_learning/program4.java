package program_learning;

import java.util.Scanner;

public class program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character");
		char ch=sc.next().charAt(0);
		int acii=ch;
		System.out.println("ACII value of "+ch +" is:  "+ acii);
		//typecasting -->char to int
	    int acii_value=(int)ch;
	    System.out.println("ACII value of "+ch +" is:  "+ acii_value);
		
	}

}
