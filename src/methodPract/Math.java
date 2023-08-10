package methodPract;

public class Math {

	public static void main(String[] args) {
	     Addition(6, 4);
	     Substraction();
	     Math m=new Math();
	     m.Multiplication(5, 9);
		
	}
	
	public static void  Addition(int a, int b) {
		int add=a+b;
		System.out.println("Addition :"+add);	
	}
	public static void Substraction() {
		int a,b,sub;
		a=10;
		b=4;
		sub=a-b;
		System.out.println("Substraction :"+sub);
	
	}
	public void Multiplication(int a,int b) {
		int mul=a*b;
		System.out.println("Multiplication :"+mul);
		
	}

}
