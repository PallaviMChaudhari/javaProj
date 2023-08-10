package constructorPract;

public class Cs_1 {
	  // global variable
	int num1,num2,num3; 
	int sum;
	public Cs_1() {       //constructor without parameter 
		num1=34;
	    num2=26;
		num3=10;
	}
	 
	public Cs_1(int a) {           //constructor with 1 parameter
		num1=a;	
	}
	
	public Cs_1(int a,int b) {       //constructor with 2 parameter
		num1=a;
		num2=b;
		
	}
	
	public Cs_1(int a,int b,int c) {      //constructor with 3 parameter
		num1=a;
		num2=b;
		num3=c;
		
	}
	
	public static void main(String[] args) {
		    Cs_1 s=new Cs_1();  
			s.addition();
			Cs_1 s1=new Cs_1(55);
			s1.addition();
			Cs_1 s2=new Cs_1(30,100 );
			s2.addition();
		    Cs_1 s3=new Cs_1(50, 12, 60);
		    s3.addition();
		    s3=new Cs_1(2, 10, 40);
		    s3.addition();
		    s2=new Cs_1(4, 5);
		    s2.addition();
		    
	}
	
	public void addition() {
		sum=num1+num2+num3;
		System.out.println("Addition is :"+sum);
	}

}
