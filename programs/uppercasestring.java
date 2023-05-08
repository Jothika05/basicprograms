package programs;

public class uppercasestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    StringBuilder a=new StringBuilder("abc");
		    System.out.println("original input:" +a);
		    for(int i=0;i<a.length();i++)
		    {
		    	if(a.charAt(i)  >= 97 && a.charAt(i) <= 122) 
		    	{
		    		int c=(int)a.charAt(i)-32;  //97-32=65   , 98-32=66  ,99=32=67
		    		a.setCharAt(i, (char)c);   // A  B C
		    	}
		    }
		    
		    System.out.println("upper caes output:"  +a);	
		    	
		 
	}

}
