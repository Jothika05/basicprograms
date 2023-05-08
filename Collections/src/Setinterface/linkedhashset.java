package Setinterface;

import java.util.LinkedHashSet;
// remove dulicate,print insertion order
public class linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  LinkedHashSet lhs=new  LinkedHashSet();
  lhs.add(10);
  lhs.add(21);
  lhs.add(22);
  lhs.add(12);
  lhs.add(222);
  lhs.add(98);
  lhs.add(65);
  lhs.add(40);
  lhs.add(21);  //duplicate
  lhs.add(34);
  lhs.add(10);  //duplicate
  System.out.println(lhs);
	}

}
