package as;

import accessSpecifiers.Specifiers;

public class Specifiers2 extends Specifiers {

	public static void main(String[] args) {
		Specifiers2 s1=new Specifiers2();
		int add=50+s1.a;   //calling public variable from different package
		System.out.println("Addition :"+add);
		int sub=50-s1.b;   //calling protected variable from different package
		System.out.println("Substraction :"+sub);
		
	}

}
