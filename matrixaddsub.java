package basicprograms;

import java.util.Scanner;

public class matrixaddsub {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=2;
		
		int[][] a=new int[n][n];
		int[][] b=new int[n][n];
		int[][] c=new int[n][n];
		
	 System.out.println("Matrix A:");
	 for(int i=0;i<n;i++) {
		 for( int j=0;j<n;j++) {
			 a[i][j]=sc.nextInt();
	        }
		 }
	 
	 System.out.println("Matrix B:");
	 for(int i=0;i<n;i++) {
		 for( int j=0;j<n;j++) {
			 b[i][j]=sc.nextInt();
	       }
		
	 }
	 for(int i=0;i<n;i++) {
		 for( int j=0;j<n;j++) {
	        	c[i][j] =a[i][j] + b[i][j]; //  c[i][j] =a[i][j] - b[i][j];
			
	       }
	 }
	   System.out.println("addition of two matrics is:");
	    for(int i=0;i<n;i++) {
		 for( int j=0;j<n;j++) {
			 System.out.print(c[i][j]+"  ");
	 
		 }
		 System.out.println();
	 }
	}
}


