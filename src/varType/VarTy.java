package varType;

public class VarTy {
	
	static int a=30;     //Static global variable 
	int b=20;            //Non static global variable

	public static void main(String[] args) {
		VarTy vr=new VarTy();        //object create
		System.out.println("=========Static variable from same class==========");
		System.out.println("value of static variable a:"+a);   //static variable call from same class 
		int sum=55+a;
		System.out.println("Addition is :"+sum);
		
		System.out.println("==============Non Static var from same class=============");
		System.out.println("value of non static variable b:"+vr.b);
		int sub=80-vr.b;
		System.out.println("Substraction is:"+sub);
		
		System.out.println("===========Static variable call from from diff class=========");
		System.out.println("Static variable from diff class x:"+Vrp.x);
		int mul=40*Vrp.x;
		System.out.println("Multipliction is:"+mul);
		
		System.out.println("============Non static var from diff class=========");
		Vrp v=new Vrp();
		System.out.println("non static var call from diff class z:"+v.z);
		int div=60/v.z;
		System.out.println("Division :"+div);
	
		display();       // static method call
		vr.display1();   //non static method call
		  
		
	}
	
	public static void display() {
		System.out.println("============================");
		System.out.println("Static Variable a:"+a);
		//we can not call non static variable call into static method 
		VarTy v=new VarTy();
		System.out.println("Non static var from diff class b:"+v.b);
		Vrp v1=new Vrp();
	    System.out.println("Non static var from diff class z:"+v1.z);
	   
		
		
		
	}
	
	public void display1() {
		System.out.println("Static variable a:"+a);
		System.out.println("non static variable b:"+b);
		System.out.println("Static var x:"+Vrp.x);
	    Vrp v=new Vrp();
	    System.out.println("Non static var from diff class z:"+v.z);
	   
	}

}
