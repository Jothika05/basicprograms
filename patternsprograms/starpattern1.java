package patternsprograms;

public class starpattern1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				for(int i=1;i<=5;i++) {
					for(int j=1;j<=5;j++) {
						System.out.print("*");
					}
					
				System.out.println();
				}
		System.out.println("=========================================");
				
			    for(int i=1;i<=5;i++) {
					for(int j=1;j<=i;j++) {
						System.out.print("*");
					}
					
				System.out.println();
				}
		System.out.println("=========================================");		
			      for(int i=1;i<=4;i++) {
				    for(int j=1;j<=2*i-1;j++) {
					    System.out.print("*");
				     }
				
			        System.out.println();
			       }
		System.out.println("=========================================");
		 for(int i=5;i>=1;i--) {
			    for(int j=1;j<=i;j++) {
				    System.out.print("*");
			     }
			
		        System.out.println();
		       }
			}

		}

