package collection_method;

import java.util.Comparator;

public class Comparatordemo implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		mobile l1=(mobile)o1;
		mobile l2=(mobile)o2;
		int result=l1.color.compareTo(l2.color); //string type ku  this method use pananum.--> the operator > is undefined for the argument type(s) boolean, boolean
		if(result>0)
			return +1;
		else if(result<0)
			return -1;
		else
			return 0; 

	/*if(l1.price>l2.price)
		return +1;
	else if(l1.price<l2.price)
		return -1;
	else
		return 0; */
		
		
		/*if(l1.gb>l2.gb)
		return +1;
	else if(l1.gb<l2.gb)
		return -1;
	else
		return 0; */
		
	}

}
