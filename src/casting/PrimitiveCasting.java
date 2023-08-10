 package casting;

public class PrimitiveCasting extends Mother{

	public static void main(String[] args) {
		//implicit cast
		byte a=10;
		System.out.println("A"+a);
		
		int b=a;
		System.out.println("B"+b);
		
		//explicit cast
		double c=10.6748787;
		System.out.println("C"+c);
		
		int d=(int) c;
		System.out.println("D"+d);
	

	}
	public void display() {
		System.out.println("we are working....");
		
	}
	public void test() {
		System.out.println("we are dancing....");
	}
	

}
