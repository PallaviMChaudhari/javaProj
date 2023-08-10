package interfaceStudy;

public class CalImpliments implements Calculations,Cal {
	int x,y;

	public static void main(String[] args) {
		CalImpliments c=new CalImpliments();
		c.add(50, 20);
		c.sub();
		c.mul();
		c.div(60, 10);
		
		

	}

	

	@Override
	public void sub() {
		int a=10,b=3,sub;
		sub=a-b;
		System.out.println("substraction :"+sub);
		
	}



	@Override
	public void add(int a, int b) {
		x=a;
		y=b;
		int sum=x+y;
		System.out.println("addition :"+sum);
		
		
	}



	@Override
	public void mul() {
		int a=10,b=5,multi;
		multi=a*b;
		System.out.println("multiplication :"+multi);
		
	}



	@Override
	public void div(int a, int b) {
		
		x=a;
		y=b;
		int div=x/y;
		System.out.println("division :"+div);
		
	}

}
