package programs;

import java.util.Scanner;

public class decimal_binary {
	public static void decimal2Binary(int n) { //12
		int[] binaryNum=new int[1000];
	    int	i=0;
	    while(n>0) {            //12>0  6>0   3>0    1>0   0>0
	    	binaryNum[i]=n%2;   //0      0      1   1
	    	n=n/2;              // 6    3       1    0
	    	i++;                //1    2      3      4
	    }
		
		// 0 0 1 1
	    //1 1 0 0
	    for(int j=i-1;j>=0;j--) {
	    	System.out.print(binaryNum[j]);
	    }
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter the decimal no:");
	    int n=sc.nextInt();
	    System.out.println("decimal number is :" + n);
	    System.out.print("binary number is: " );
	    decimal2Binary(n);
	
	}


	
	
	

}
