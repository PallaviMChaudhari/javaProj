package constructorPract;

public class Cs2 {
	int a, b,c,sum;   //declare global variable 
	
    public Cs2()
	{
		a=20;         //user define without para
	}	

	public Cs2(int num1)    //user define n with para
	{
		a=num1;	
	}
	public Cs2(int num1, int num2)
	{	
       a=num1;
       b=num2;	
	}
	public Cs2(int num1,int num2,int num3) {
		a=num1;
		b=num2;
		c=num3;
	}

	public static void main(String[] args) {
		
		Cs2 c=new Cs2();
		c.addition();
		Cs2 c1=new Cs2(5);
		c1.addition();
		Cs2 c2=new Cs2(22, 10);
		c2.addition();
		Cs2 c3=new Cs2(43, 3, 5);
		c3.addition();

	}
	 public void addition() {
		 sum=a+b+c;
		 System.out.println("Addition is :"+sum);
		 
	 }
	
	
	

}
