package Arraylearning;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;



public class stringcomparator {
	
	     public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] arr= {2,43,98,65,31};
			Arrays.sort(arr);
			for(int i:arr){
				System.out.println(i);
			}
			
			System.out.println("------------------");
		   String[] names= {"radha","anubaaaaamaa","priya","siva","arul","bharathi","abi","jayapriya","mahalakshimi","aruna","suryapriya"};
		   Arrays.sort(names);
			for(String i:names){
				System.out.println(i);
			}
			System.out.println();  
	    			
			//dinamic binding
			Comparator comp=new stringcomparatorDemo();
			 
			
			Arrays.sort(names,comp);
			System.out.println("------After compare method use-----------");
			for(String i:names){
				System.out.println(i);
			}
			
			
			
			
		   }

		}



