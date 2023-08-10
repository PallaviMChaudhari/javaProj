package methodPract;

public class MyMethod {

	public static void main(String[] args) {
		
		System.out.println("main method is running from Mymethod class");
		method();   //static method call from same class

	}
	
	public static void method() {
		System.out.println("Static method is running from MyMethod class ");
	}

}
