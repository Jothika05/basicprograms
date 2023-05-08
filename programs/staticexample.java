package programs;
class Mathematical{
	public static  int power(int base,int power) {
		int result=1;
		for(int i=1;i<=power;i++) {
			result=result*base;
		}
		return result;
	}
}

public class staticexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("mathematical is " + Mathematical.power(2, 5));
	}

}
