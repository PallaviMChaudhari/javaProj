package accessSpecifiers;

public class Specifiers1 {

	public static void main(String[] args) {
		Specifiers s=new Specifiers();
		int add=100+s.a;   //calling public non static variable
		System.out.println("Add :"+add);
		int sub=200-s.b;    //calling protected non static variable 
		System.out.println("Sub :"+sub);
		int mul=100*s.c;     //calling default non static variable
		System.out.println("Mul :"+mul);
		//int div=100/s.d;   //calling is not possible to private non static variable
	}

}
