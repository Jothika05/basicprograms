package Setinterface;

import java.util.TreeSet;
// remove duplicates,print accending order
public class treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   TreeSet ts=new TreeSet();
   ts.add(10);
   ts.add(29);
   ts.add(12);
   ts.add(98);
   ts.add(22);
   ts.add(64);
   ts.add(29);  //duplicate
   ts.add(22);  //duplicate
   ts.add(34);
   ts.add(71);
   ts.add(8);
   System.out.println(ts);
	}

}
