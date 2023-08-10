package practice;

public class MultiLevel extends Single2{

	public static void main(String[] args) {
		MultiLevel m=new MultiLevel();
		m.Decrement(60, 20);
		m.add();
		m.number(); 
	}
	public void Decrement(int a,int b) {
		
		int sub=a-b;
		System.out.println("sub :"+sub);
	}

}
