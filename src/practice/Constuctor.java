package practice;

public class Constuctor {
	
	int a,b,c;
	
	public Constuctor() {
		a=10;
		b=3;
		c=40;
	}
	
	public Constuctor(int x,int y) {
		a=x;
		b=y;
		
	}
	public Constuctor(int x, int y,int z) {
		a=x;
		b=y;
		c=z;
		
	}

	public static void main(String[] args) {
		Constuctor c=new Constuctor();
		c.addition();
		c=new Constuctor(50, 30);
		c.addition();
		c=new Constuctor(10, 20, 30);
		c.addition();
	
	}
	
	public void addition() {
		int sum= a+b+c;
		System.out.println("Addition :"+sum);
	}

}
