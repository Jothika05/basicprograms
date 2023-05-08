package examples;

import java.util.Comparator;

public class Comparatordemo implements Comparator<student> {

	@Override
	public int compare(student o1, student o2) {
		// TODO Auto-generated method stub
		student s1=(student)o1;
		student s2=(student)o2;
	   int result=s1.stu_name.compareTo(s2.stu_name);
	   if(result>0)
		   return +1;
	   else if(result<0)
		   return -1;
	   else
		
		    return 0;
	}

}
