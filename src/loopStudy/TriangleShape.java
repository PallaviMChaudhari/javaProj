package loopStudy;

public class TriangleShape {

	public static void main(String[] args) {
		//count 5 start=1 update 1
		for(int i=1;i<=5;i++) {//1,2,3,4,5,6
			for(int j=1;j<=i;j++) {//j=1
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
