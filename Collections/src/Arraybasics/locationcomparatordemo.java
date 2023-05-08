package Arraybasics;

import java.util.Comparator;

public class locationcomparatordemo implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
	
			int result=e1.location.compareTo(e2.location);
			if(result>0)
					return +1;
			else if(result<0)
				return -1;
			else
				return 0;   

				
		
	}

}
