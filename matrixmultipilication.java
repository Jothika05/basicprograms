
package basicprograms;

import java.util.Scanner;

public class matrixmultipilication {

/* 	public static void main(String[] args) {
	 int n=3;
	 int[][] a= { {5,2,3},{2,6,3},{6,9,1} };
	 int[][] b= { {2,7,5},{1,4,3},{1,2,1} };
	 int[][] c=new int[n][n]; 
		
		
	 System.out.println("Matrix A:");
	 for(int i=0;i<n;i++) {
		 for( int j=0;j<n;j++) {
			 System.out.print(a[i][j]+"  ");
			 }
		 System.out.println();
	 }
	 
	 System.out.println("Matrix B:");
	 for(int i=0;i<n;i++) {
		 for( int j=0;j<n;j++) {
			 System.out.print(b[i][j]+"  ");
	 
		 }
		  System.out.println();
	 }
	 for(int i=0;i<n;i++) {
		 for( int j=0;j<n;j++) {
	         for(int k=0;k<n;k++) {
	        	c[i][j] =c[i][j] + a[i][k] * b[k][j];
	         }
		 }
	 }
	 System.out.println("the product of two matrics is:");
	 for(int i=0;i<n;i++) {
		 for( int j=0;j<n;j++) {
			 System.out.print(c[i][j]+"  ");
	 
		 }
		 System.out.println();
	 }
	 
	}	 
	 
}
*/




public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=3;
	
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
       for(int k=0;k<n;k++) {
        	
         c[i][j] =c[i][j] + a[i][k] * b[k][j];
		
       }   
	 }
 }
   System.out.println("the product of two matrics is:");
    for(int i=0;i<n;i++) {
	 for( int j=0;j<n;j++) {
		 System.out.print(c[i][j]+"  ");
 
	 }
	 System.out.println();
 }
 
}	 
 
}


