package practice;

import inheritanceStudy.Abst;

public class Concre extends Abst{
	int a=10;
	int b=4;

	public static void main(String[] args) {
		Concre c=new Concre();
		c.add();
		c.sub();
		
	   
	}

	@Override
	public void add() {
		int sum=this.a+this.b;
		System.out.println("Addition :"+sum);
		
	}

	@Override
	public void sub() {
		int sub=super.a-super.b;
		System.out.println("substraction :"+sub);
		
	}

}
