package practice;

public class Child extends parent{

	public static void main(String[] args) {
		Child c=new Child();
		c.demo();
		c.hubby();
		
		parent p=new parent();
		p.demo();
		
		parent cp=new Child();
		cp.demo();
		

	}
	
	public void demo() {
		System.out.println("My name is Moksh");
	}
	
	public void hubby() {
		System.out.println("my name is sagar");
		
	}

}
