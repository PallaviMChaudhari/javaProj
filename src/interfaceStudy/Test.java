package interfaceStudy;

public abstract class Test implements  Sample
{

	public static void main(String[] args) {
		
		//Test t=new Test();
		//t.demo();
		//t.demo2();

	}

	@Override
	public void demo() {
		System.out.println("This method is from interface... ");
	}

	@Override
	public void demo2() {
		System.out.println("This method is from interface... ");
		
	}
	
	abstract void demo3();

}
