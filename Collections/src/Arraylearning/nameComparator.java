package Arraylearning;

import java.util.Comparator;

public class nameComparator implements Comparator<emp> {

		@Override
		public int compare(emp e1, emp e2) {
			// TODO Auto-generated method stu
			return e1.name.compareTo(e2.name);
             }
}
