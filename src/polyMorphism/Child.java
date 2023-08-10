package polyMorphism;

public class Child {

	public static void main(String[] args) {
		Child c=new Child();
		c.demo();
		Parent p=new Parent();
		p.demo();
	}
	
	public void demo() {
		System.out.println("GOOD EVENING...");
	}

}
