package accessSpecifiers;

public class AccessS {

	public static void main(String[] args) {
	        AccessS as=new AccessS();
	        as.demo();        //calling public method
	        as.demo1();       //calling protected method
	        as.demo2();       //calling default method 
	        as.demo3();       //calling private method

	}
	
	public void demo() {
		System.out.println("public members access throughout the Project...");
	}
	
	protected void demo1() {
		System.out.println("Protected members access within the package and outside class access by using inheritance.");
	}
	
	void demo2() {
		System.out.println("Default member access within inside package and we cant access from other class");
	}
	
	private void demo3() {
		System.out.println("private memeber access only within class");
	}

}
