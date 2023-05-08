package programs;

public class countcharstring {

	public static void main(String[] args) {
	 StringBuilder a=new StringBuilder("What are you doing,@0848 for this time");
	 System.out.println(a);
	 int upper=0,lower=0,number=0,vowel=0,space=0,symbol=0;
	 for(int i=0;i<a.length();i++) {
		 if (a.charAt(i) >= 97 && a.charAt(i) <= 122){   //97 to 122 --> a to z
			 lower++;
		 }
         if((a.charAt(i)) >= 65 && a.charAt(i) <= 90){  //65 to 90 --> A to Z
        	 upper++;
         }
         if((a.charAt(i))==32) {
        	 space++;
         }
         if((a.charAt(i)) >= 48 && a.charAt(i) <= 57){   //48 to 57 --> num
        	 number++;
         }
         if(a.charAt(i) =='A' || a.charAt(i) == 'E' ||  a.charAt(i) =='I' || a.charAt(i) == 'O' || 
        		 a.charAt(i) =='U' || a.charAt(i) == 'a' || a.charAt(i) =='e' || a.charAt(i) == 'i' || a.charAt(i) =='o' || a.charAt(i) == 'u'){
        			 vowel++;
        		 }
	 }
        		 System.out.println("upper letter is    : " + upper);
        		 System.out.println("lower letter is    : " + lower);
        	     System.out.println("space  is          : " + space);
        		 System.out.println("number is          : " + number);
        		 System.out.println("vowel is           : " + vowel);
        		 System.out.println("symbols are        : " + (a.length()-(upper+lower+space+number)));
        		
	}

}
