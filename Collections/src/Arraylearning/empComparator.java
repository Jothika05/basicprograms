package Arraylearning;

import java.util.ArrayList;
import java.util.Collections;

public class empComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList<emp> al=new ArrayList<emp>();
  
   al.add(new emp("arul",25));
   al.add(new emp("seetha",24));
   al.add(new emp("veera",32));
   al.add(new emp("solan",29));
   al.add(new emp("vaani",40));
   al.add(new emp("geetha",34));
   al.add(new emp("pavi",37));
   al.add(new emp("divya",21));
 
  
   Collections.sort(al,new ageComparator());
   System.out.println("---------------compared to age-------------");
    for(emp e:al)
   {
	 System.out.println(e.name+" "+e.age +" ") ;
	
   }
    
    Collections.sort(al,new nameComparator());
    System.out.println("--------------compared to name-----------------");	
    for(emp e:al)
    {
 	 System.out.println(e.name+" "+e.age +" ") ;
 	
    }
}


}
