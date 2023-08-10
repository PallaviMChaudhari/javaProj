package classAbstract;

public class B extends A {

	public static void main(String[] args) {
		B b=new B();
		b.demo();
		b.demo1();
		b.demo3();
		B.demo2();
		
	}


	@Override
	public void demo1() {
		System.out.println("Demo1 method is a incomplete method in class A,class B gives the definition");
		
	}
	public void demo3() {
		System.out.println("Demo3 method is from class B");
	}

}
