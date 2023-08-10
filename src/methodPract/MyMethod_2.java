package methodPract;

public class MyMethod_2 {

	public static void main(String[] args) {
		
		System.out.println("Main method is running in MyMethod_2");
		
		demo();//Static method call from same class
		
		System.out.println();
		
		MyMethod.method();//static method is running from different class
		
	}
	
	public static void demo() {
		System.out.println();
		System.out.println("Demo method is running in Mymethod_2 class ");
		//method running in same class
	}
	

}
