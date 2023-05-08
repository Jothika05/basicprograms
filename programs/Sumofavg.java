package programs;

import java.util.Scanner;

public class Sumofavg {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
       System.out.println("enter the limit:");
       int n=sc.nextInt();
      
       int sum=0;
       for(int i=1;i<=n;i++) {
    	   System.out.println("enter the number "+i+": ");
    	   int a=sc.nextInt();
    	   sum=sum+a;
       }
       System.out.println("sum of number is: "+sum);
       
       System.out.println("the sum of average is: "+ sum/n);
       
       
	}
}

	
/*

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int sum=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the array size:");
    int n = sc.nextInt();
    
    int arr[] = new int[n];
     for(int i=0;i<n;i++) {
      System.out.println("Enter the elements");
      arr[i]=sc.nextInt();
       }
    System.out.println("Array elements are :");
    
    for(int i=0;i<n;i++) {
    System.out.println(arr[i]);
    sum+=arr[i];
    }
    
    
    System.out.println("Sum is " + sum);
    System.out.println("Average value is " + sum/n);
}
}
    */
/*
  public static void main(String[] args) {
   int arr[]= {5,6};
   int n, sum=0;
   float avg;

    
    for( int i=0;i<arr.length;i++) {
     
      sum+=arr[i];
    }
    
    avg=sum/arr.length;
    System.out.println("Sum is " + sum);
   System.out.println("Average value is " + avg);
}
}
   
       */
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
	