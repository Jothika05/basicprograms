
package programs;

import java.util.Scanner;

public class binary_decimal {
public static int bin2dec(int binary) {
	int power=0,decimal=0;
	while(binary!=0) 
	{
		int rem=binary%10;
		decimal += rem* Math.pow(2,power);
        binary=binary/10;
        power++;
	}
	return decimal;
    }
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter binary  no:");
	    int n=sc.nextInt();
	    System.out.println("decimal no is :" +bin2dec(n));
	}

}
