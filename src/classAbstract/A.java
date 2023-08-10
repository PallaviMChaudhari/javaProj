package classAbstract;

public abstract class A {

	public static void main(String[] args) {
		//we can't create object of abstract class A,compiler not allow to create object of abstract class
		demo2();

	}
	
	public void demo() {
		System.out.println("Demo method is from a class A");
	}
	
	public abstract void demo1();
	public static void demo2() {
		System.out.println("Demo2 method is a static method which is from class A");
	}

}
