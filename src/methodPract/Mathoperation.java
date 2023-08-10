package methodPract;

public class Mathoperation {

	public static void main(String[] args) {
		
		System.out.println("Main is running in Mathoperation...");
		System.out.println("Mathoperation perform...");
		Addition(); //call static method from same class 
		Mathoperation op = new Mathoperation();//creating object of same class that is MathOperation
		op.Substraction();//Non static method call from same class
		Operation.Multiplication();//static method call from different class
		Operation o = new Operation();////creating object of different class
		o.Division();	//Non static method call from different class
	}
	
	public static void Addition() {   
		int a,b,sum;
		a=60;
		b=53;
		sum=a+b;
		System.out.println("Addition is :"+sum);
		
	}
	public void Substraction() {
		int c,d,sub;
		c=50;
		d=26;
		sub=c-d;
		System.out.println("Substraction is :"+sub);
		
	}

}
