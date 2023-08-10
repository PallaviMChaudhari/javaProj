package loopStudy;

public class WhileLoopStudy {

	public static void main(String[] args) {
		// increment and decrement order while loop using to print Diamond  pattern
		int a=1;
		while(a<=5) {
			for(int b=5;b>a;b--) {
				System.out.print(" ");
			}
			for(int b=1;b<=a;b++) {
				System.out.print("* ");
			}
			System.out.println();
			a++;
		}
		
		int i=1;
		while(i<5) {
			int j=1;
			while(j<=i) {
				System.out.print(" ");
				j++;
			}
			int k =5;
			while(k>i){
				System.out.print("* ");
				k--;
			}
			System.out.println();
			i++;
		}

	}

}
