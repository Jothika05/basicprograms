package Arraybasics;

import java.util.ArrayList;
import java.util.Collections;

public class nameee{
		// TODO Auto-generated method stub
public static void main(String[] args) {
		    // TODO Auto-generated method stub
		        ArrayList <String> list = new ArrayList<String>();
		        list.add("Dineshkumar");
		        list.add("Dinesh");
		        list.add("Sathish");
		        list.add("Praveen");
		        list.add("Lokeshwaran");
		        list.add("vijay");
		        list.add("Gokar");
		        comparatordemo1 cd=new comparatordemo1();
		        Collections.sort(list,cd);
		       for(String i  : list) {
		         System.out.println(i);
		       }
	        
		  
		  }

}




		   
		  
