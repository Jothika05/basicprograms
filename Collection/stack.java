package Collection;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Stack s=new Stack();
      s.push("A");
      s.push("B");
      s.push("C");
      s.push("u");
      System.out.println(s);
      System.out.println(s.peek());
      System.out.println(s);
      System.out.println(s.pop());
      System.out.println(s);
      System.out.println(s.search("Z"));
      
      
	}

}
