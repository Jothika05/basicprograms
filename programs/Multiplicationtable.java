package programs;

import java.util.Scanner;

public class Multiplicationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the table:");
          int t=sc.nextInt();
          System.out.println("enter the limit:");
          int n=sc.nextInt();
          for(int i=1;i<=n;i++) {
        	System.out.println(t  + "*" + i + "=" + (t*i)); 
          }
          
          
          
          
          
          
          
          
          
          
          
	}

}
