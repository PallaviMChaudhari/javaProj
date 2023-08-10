package practice;

public class Single2 extends Single1{
	int sum;

	public static void main(String[] args) {
		Single2 s=new Single2();
		s.add();
		s.number();
		
	}
	
	public void add() {
		for(int i=1;i<=10;i++) {
			sum=sum+i;
		}
		System.out.println("Addition of 1to10 number :"+sum);
	}

}
