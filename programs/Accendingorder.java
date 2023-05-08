
package programs;

import java.util.Arrays;
import java.util.Scanner;

public class Accendingorder {

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a=new int[] {2,8,5,9,2,4,7,5};
        System.out.println("before sort: " +Arrays.toString(a));
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {   // decending --> a[i]<a[j]
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("after sort:" + Arrays.toString(a));
	}

}
*/
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("enter the limit:");
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
   	 System.out.println("enter a value of a["+i+"]: ");
   	 a[i]=sc.nextInt();
    }
     System.out.println("before sort: " +Arrays.toString(a));
	int temp;
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {  // decending --> a[i]<a[j]
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println("after sort:" + Arrays.toString(a));
}
}


	

	
	
	
	
	
	
	






