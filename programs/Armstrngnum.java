package programs;

public class Armstrngnum {


	public static void main(String[] args) {
     int digit1,digit2,digit3,temp;
     int result;
     for( int n=100;n<=999;n++) {
    	 temp=n;
    	 digit3=temp%10;  //3
    	 temp=temp/10;  //15
    	 
    	 
  
    	 digit2=temp%10; //5
    	 temp=temp/10;   //1
    	 
    	
    	 digit1=temp%10; //1
    	         //1*1*1              +5*5*5                  +3*3*3
    	 result=(digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);
     
      if(n==result)
    	 System.out.println(n + "is a armstorng number");
	}
}
}
