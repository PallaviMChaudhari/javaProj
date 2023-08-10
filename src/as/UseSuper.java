package as;

public class UseSuper extends UseThis{
	
	int a=20;
	int b=10;
	static int c=40;

	public static void main(String[] args) {
		UseSuper us=new  UseSuper();
		us.substraction();
		
		
		

	}
	
	public void substraction() {
		int a=50;
		int b=25;
		int c=20;
		System.out.println("local variable A is :"+a);  
		System.out.println("local variable B is :"+b);
		int sub=a-b;
		System.out.println("Substraction :"+sub);
		
		System.out.println("=============================");
		
		System.out.println("global variable of subclass A is :"+this.a);  
		System.out.println("global variable of subclass B is :"+this.b);
		int sub1=this.a-this.b;
		System.out.println("Substraction :"+sub1);
		
		System.out.println("================================");
		System.out.println("global variable A from super class is :"+super.a);  
		System.out.println("global variable B from super class is :"+super.b);
		int substraction=super.a-super.b;
		System.out.println("Substraction :"+substraction);
		
		int sum=10+c;
		System.out.println(sum);
		System.out.println(c);
		int add=10+UseSuper.c;
		System.out.println(add);
		System.out.println(UseSuper.c);
	
		
	}

}
