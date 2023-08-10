package constructorPract;

public class Cnstrct_1 {
	
	int a=5; 
	String name ="Pallavi";
	
/*	public Cnstrct_1()
	{
		
	}*/
	
	public Cnstrct_1() {
		a=50;
		name="Riddhi";
		
	}

	public static void main(String[] args) {
		Cnstrct_1 cs =new Cnstrct_1();
		cs.display();
		cs.varShow();
		
	}
	
	public void display() {
		System.out.println("Default constructor provided by compiler...");
		
	}
	
	public void varShow() {
		System.out.println("Name is :"+name);
		System.out.println("Number is :"+a);
	}

}
