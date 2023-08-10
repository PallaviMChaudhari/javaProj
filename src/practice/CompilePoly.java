package practice;

public class CompilePoly {

	public static void main(String[] args) {
		CompilePoly cp=new CompilePoly();
		cp.add(40,60);
		cp.add(10, 20, 30);
		cp.add(1, 2, 3, 4);
		
	}
	public void add(int a,int b,int c) {
		int sum=a+b+c;
		System.out.println("Addition :"+sum);
	}
	public void add(int a,int b) {
		int sum=a+b;
		System.out.println("Addition :"+sum);
	}
	public void add(int a,int b,int c,int d ) {
		int sum=a+b+c+d;
		System.out.println("Addition :"+sum);
	}
	

}
