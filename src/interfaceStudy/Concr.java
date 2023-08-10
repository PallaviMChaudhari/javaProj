package interfaceStudy;

public class Concr extends Test
{

	public static void main(String[] args) {
		Concr c=new Concr();
		c.demo();
		c.demo2();
		c.demo3();

	}

	@Override
	void demo3() {
		System.out.println("this method is from test but definition gives by Concr");
		
	}

}
