package constructorPract;

public class Cs {
	int a,b,c;      //global variable
	
	public Cs() {    //user define n without parameter
		a=10;
	}
	
	public Cs(int x) {
		a=x;
	}
	 public Cs(int x, int y) {
		 a=x;
		 b=y;
	 }
	

	public static void main(String[] args) {
		Cs c=new Cs();
		c.display();
		Cs c1=new Cs(34, 12);
		c1.display();
		c1=new Cs(6);
		c1.display();
	}
	
	public void display() {
		System.out.println("A is :"+a);
		System.out.println("B is :"+b);
	}
	 
}
