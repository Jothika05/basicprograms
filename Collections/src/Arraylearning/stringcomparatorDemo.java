package Arraylearning;

import java.util.Comparator;

public class stringcomparatorDemo implements Comparator <Object>{
	@Override
	public int compare( Object o1, Object  o2) {
		String s1=(String) o1;
		String s2=(String) o2;
		if(s1.length()>s2.length())
			 return +1;        // -1
		else if(s1.length()<s2.length())
		     return -1;        // +1
		else
			 return 0;
		
	}

}

