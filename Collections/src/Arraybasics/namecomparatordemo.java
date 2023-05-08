package Arraybasics;

import java.util.Comparator;

	

public class namecomparatordemo implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
	int result=e1.name.compareTo(e2.name);
			if(result>0)
				return +1;
			else if(result<0)
				return -1;
			else
				return 0;  
	//		return e1.name.compareTo(e2.name);
             }

	}




	
