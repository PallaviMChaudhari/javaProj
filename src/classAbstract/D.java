package classAbstract;

public class D extends C{

	public static void main(String[] args) {
		D d1=new D();
		d1.display();
		d1.play();
		d1.run(); 

	}
	public void display() {
		System.out.println("display something");
		
	}

	public void play() {
		System.out.println("play movie");
		
	}

}
