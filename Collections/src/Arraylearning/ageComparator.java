package Arraylearning;

import java.util.Comparator;
class emp{
	String name;
	int age;

	emp(String n,int a){
		this.name=n;
		this.age=a;
		
	}
	
}
public class ageComparator implements Comparator<emp> {

	@Override
	public int compare(emp e1, emp e2) {
		// TODO Auto-generated method stu
		if(e1.age>e2.age)
			return +1;
		else if(e1.age<e2.age)
			return -1;
		return 0;
	
	}
	


}
