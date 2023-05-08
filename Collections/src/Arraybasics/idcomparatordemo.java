package Arraybasics;

import java.util.Comparator;

public class idcomparatordemo implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		if(e2.empid>e1.empid)
			return +1;
		else if(e2.empid<e1.empid)
		   return -1;
		else
		  return 0;
	//	return e1.empid.compareTo(e2.empid); -->cannot invoke compareTo(int) on the primitive type int 
	}

}
