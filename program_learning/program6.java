package program_learning;

import java.util.Scanner;

public class program6 {

	public static void main(String[] args) {
		// with using temp value
      int a=5;
      int b=10;
      int temp=0;
    System.out.println("before swapping: " +a  +"  " +b);
     temp=a;    //t=5
     a= b;      //a=10
     b=temp;     //b=5
     System.out.println("after swapping: " +a  +"  " +b);
     
     System.out.println("--------------------------------"); 
     //without using temp value
     int a1=2;
     int b1=4;
     System.out.println("before swapping: " +a1  +"  " +b1);
     a1=a1-b1;  //2-4=-2 
     b1=a1+b1; //-2+4=2 
     a1=b1-a1; //2--2=4
     System.out.println("after swapping: " +a1  +"  " +b1);
     
	}

}
