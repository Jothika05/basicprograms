package programs;

public class lowercasestring {
	public static void main(String[] args) {
		
		    StringBuilder a=new StringBuilder("ARUL JOTHI");
		    System.out.println("original input:" +a);
		    for(int i=0;i<a.length();i++)
		    {
		    	if(a.charAt(i)  >= 65 && a.charAt(i) <=90) 
		    	{
		    		int c=(int)a.charAt(i) +32;  //65+32=97 ,66+32=98 ,67+32=99
		    		a.setCharAt(i,(char)c);   // a b c
		    	}
		    }
		    
		    System.out.println("lower case output:"  +a);	
		    	
		 

}
}