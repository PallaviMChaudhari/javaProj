package inheritanceStudy;

public class SingleLevelInheritance {

	public static void main(String[] args) {
		A.add();   //calling static method of A class
		A a=new A();
		a.sub();    //calling Non static method of A class

		B.multi();     //calling static method of B class
		B.add();       //calling static method of A class
		
		B b=new B();
		b.divi();     //calling Non static method of B class
		b.sub();      //calling Non static method of A class
		
		
	}

}
