package as;

import accessSpecifiers.AccessS;

public class AccessS2 extends AccessS
{

	public static void main(String[] args) {
		AccessS as=new AccessS();
		as.demo();  //public 
	    AccessS2 a=new AccessS2();
	    a.demo();   //public 
	    a.demo1();  //protected
		
	}

}
