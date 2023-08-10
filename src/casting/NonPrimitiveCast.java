package casting;

public class NonPrimitiveCast {

	public static void main(String[] args) {
		Father f=new Father();
		f.bike();
		f.car();
		
		Son s=new Son();
		s.bike();
		s.car();
		s.degaree();
		
		Father fs=new Son();
		fs.bike();
		fs.car();
		
	}

}
 