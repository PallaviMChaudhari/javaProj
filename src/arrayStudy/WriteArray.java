package arrayStudy;

public class WriteArray {

	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}
		System.out.println("============================");
		
		char b[]= {'a','b','c','d','e'};
		
		for(int i=0;i<=b.length-1;i++) {
			System.out.println(b[i]);
		}
		
		System.out.println("===============================");
		
		String c[][]=new String[3][3];
		c[0][0]="aaa";
		c[0][1]="bbb";
		c[0][2]="ccc";
		c[1][0]="ddd";
		c[1][1]="eee";
		c[1][2]="fff";
		c[2][0]="ggg";
		c[2][1]="hhh";
		c[2][2]="aaa";

		for(int i=0;i<=c.length-1;i++) {
			for(int j=0;j<=c.length-1;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("===============================");
		
		char d[][]= {{'a','c','b'},{'d','g','h'}};
		for(int i=0;i<=1;i++) {
			for(int j=0;j<=2;j++) {
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
		


	}

}
