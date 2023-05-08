package program_learning;

import java.util.Scanner;

public class program_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character");
		char ch=sc.next().charAt(0);
		if(ch>='a'&&ch<='z' || ch>='A' && ch<='Z')
			System.out.println("Alphabet");
		else
			System.out.println("not Alphabet");
	}

}
