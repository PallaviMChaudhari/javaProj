package constructorPract;

public class Con1 {
	int i,j,k;
	public Con1(int a,int b,int c) {

		i=a;
		j=b;
		k=c;
		
	}
	
	public Con1() {
		 i=5;
		 j=6;
		
	}
	
	public Con1(int a,int b) {
		
	    i=a;
	    j=b;
	
	}

	public static void main(String[] args) {
		Con1 aa=new Con1();
		Con1 bb=new Con1(4,6);
		Con1 cc=new Con1(8,9,4);
		Con1 dd=new Con1(1,6);
		
		aa.Add();
		bb.Add();
		cc.Add();
		dd.Add();

	}
	public void Add() {
		int sum;
		sum=i+j+k;
		System.out.println("Addition :"+sum);
	}

}
