package accessSpecifiers;

public class Specifiers {
	
	public int a=15;
	protected int b=5;
	int c=10;
	private int d=2;

	public static void main(String[] args) {
		Specifiers sp=new Specifiers();
		sp.addition();
		sp.substraction();
		sp.multiplication();
		sp.division();
		
	}
	
	public void addition() {
		int sum=a+b;
		System.out.println("Addition :"+sum);
	} 
	
	public void substraction() {
		int sub=c-b;
		System.out.println("Substraction :"+sub);
	}
	public void multiplication() {
		int mul=c*d;
		System.out.println("Multiplication :"+mul);
	}
	public void division() {
		int div=c/d;
		System.out.println("Division :"+div);
	}

}
