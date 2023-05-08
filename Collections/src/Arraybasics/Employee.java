package Arraybasics;

import java.util.*;

public class Employee {
	int empid;
	String name;
	int salary;
	String location;

	
	Employee(int id,String name,int s,String l){
		this.empid=id;
		this.name=name;
		this.salary=s;
		this.location=l;
		}
	

	public static void main(String[] args) {
		
	   ArrayList<Employee> al=new ArrayList<Employee>();
	    
		al.add(new Employee(123,"ramaaa",22000,"chennai"));
		al.add(new Employee(124,"seetha",23000,"trichy"));
		al.add(new Employee(122,"arulll",15000,"bengalure"));
		al.add(new Employee(132,"bharathi",24000,"chennai"));
		al.add(new Employee(120,"vishunu",24000,"villupuram"));
		al.add(new Employee(105,"zaaraa",10000,"trichy"));

		Collections.sort(al, new namecomparatordemo());
		 System.out.println("---------------compared to name------------");
		    for(Employee e:al)
		   {
			 System.out.println(e.empid+"  "+e.name+"   "+e.salary +"  " +e.location) ;
			
		   }
		    
		   Collections.sort(al,new salarycomparatordemo());
		    System.out.println("--------------compared to salary-----------------");	
		    for(Employee e:al)		    {
		    	 System.out.println(e.empid+"  "+e.name+"  "+e.salary +"  "+e.location) ;
		 	
		    }  
		    Collections.sort(al,new idcomparatordemo());
		    System.out.println("--------------compared to empid-----------------");	
		    for(Employee e:al)		    {
		    	 System.out.println(e.empid+"  "+e.name+"  "+e.salary +"  "+e.location) ;
		 	
		    } 
		    Collections.sort(al,new locationcomparatordemo());
		    System.out.println("--------------compared to location-----------------");	
		    for(Employee e:al)		    {
		    	 System.out.println(e.empid+"  "+e.name+"  "+e.salary +"  "+e.location) ;
		 	
		    } 
	}



	


}

