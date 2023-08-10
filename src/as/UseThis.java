package as;

public class UseThis {
	int a=50;
	int b=40;

	public static void main(String[] args) {
		UseThis ut=new UseThis();
		ut.addition();
		
	}
	
	public void addition() {
		int a=20;
		int b=30;
		int add=a+b;
		System.out.println("local variable A is :"+a);
		System.out.println("local variable B is :"+b);
		System.out.println("Addition :"+add);
		
		System.out.println("=============================================");
		
		System.out.println("global variable A is :"+this.a);
		System.out.println("global variable B is :"+this.b);
		int sum=this.a+this.b;   //using this keywords call global variable
		System.out.println("Additon of global a&b :"+sum);
		
	}

}
