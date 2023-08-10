package polyMorphism;

public class PolyMorphismStudy {

	public static void main(String[] args) {
		PolyMorphismStudy pl=new PolyMorphismStudy();
		pl.add();
		pl.add(5, 6);
		pl.add(8, 5, 4);
		pl.add(10.3f, 10.6f);
		

	}
	
	public void add() {
		int a=5;
		int b=9;
		int sum=a+b;
		System.out.println("Addition :"+sum);
	}
	
	public void add(int a,int b) {
		int sum=a+b;
		System.out.println("Addition :"+sum);
		
	}
	
	public void add(int a,int b,int c)
	{
		int sum=a+b+c;
		System.out.println("Addition :"+sum);
	}
	public void add(float a,float b) {
		float sum=a+b;
		System.out.println("Addition :"+sum);
	}

}
