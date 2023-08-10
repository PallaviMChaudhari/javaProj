package loopStudy;

public class DoWhileStudy {

	public static void main(String[] args) {
		//by using do while increment or decrement loop draw pattern
		
		int a=1;
		do {
			for(int b=a;b<5;b++) {
				System.out.print(" ");
			}
			int b=1;
			while(b<=5) {
				System.out.print("* ");
				b++;
			}
			System.out.println();
		    a++;	
		}while(a<=5);
		
		System.out.println("=======================");
		//do while loop in decrement order
		int b=5;
		do {
			
			for(int i=1;i<=5;i++) {
				System.out.print("*");
			}
			
			System.out.println();
			b--;
		}while(b>=1);
		
	}

}
