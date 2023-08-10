package casting;

public class PrimitiveCast extends Mother{

	public static void main(String[] args) {
		System.out.println("=======implicit cating=========");
		int a=5;
		System.out.println("value of A :"+a);
		
	    double b=a;
	    System.out.println("value of b :"+b);
	    
	    System.out.println("=======explicit cating=========");
	    float p=4.55f;
	    System.out.println("value of p :"+p);
	    
	    int q= (int) p;
	    System.out.println("value of q :"+q);
	    
	    int x =6;
	    System.out.println("value of y :"+x);
	    
	    byte y=(byte) x;
	    System.out.println("value of y :"+y);
	    

	}

}
