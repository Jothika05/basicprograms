package patternsprograms;

public class numberpattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(i);
			}
			
		System.out.println();
		}
		
System.out.println("=========================================");
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(j);
			}
			
		System.out.println();
		}
		
System.out.println("=========================================");
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			
		System.out.println();
		}
System.out.println("=========================================");
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			
		System.out.println();
		}
	}

}
