package Setinterface;

import java.util.HashSet;
// remove duplicates,print unorder 
public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  HashSet hs=new HashSet();
  hs.add(3);
  hs.add(12);
  hs.add(2);
  hs.add(7);
  hs.add(9);
  hs.add(54);
  hs.add(69);
  hs.add(7); //duplicate
  hs.add(12); //duplicate
  hs.add(3);  //duplicate
  System.out.println(hs);
	}

}
