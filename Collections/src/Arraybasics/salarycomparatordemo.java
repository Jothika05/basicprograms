package Arraybasics;

import java.util.Comparator;

public class salarycomparatordemo implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
	
		if(e2.salary>e1.salary)
			return +1;
		else if(e2.salary<e1.salary)
			return -1;
		return 0;
	//	return e1.salary.compareTo(e2.salary);// -->cannot invoke compareTo(int) on the primitive type int 
 
	}

}
