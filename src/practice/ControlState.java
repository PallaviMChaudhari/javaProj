package practice;

public class ControlState {

	public static void main(String[] args) {
		// if else
		
		int a=60;
		
		if(a==0) {
			System.out.println("a is zero");
		}
		else if(a>0) {
			System.out.println("a is positive number");
		}
		else {
			System.out.println("a is negative number");
		}
		
		System.out.println("==========================");
		
		int age=25;
		
		if(age>=18) {
			if(age>=21) {
				System.out.println("u r eligible for mariage as well as voting");
			}
			else {
				System.out.println("u r not eligible for mariage only eligible for voting");
			}
				
		}
		else {
			System.out.println("u r not eligible for voting ");
		}
		
		System.out.println("=================================");
		
		char gen='f';
		
		switch(gen) {
		case 'm':System.out.println("u r men");
		         break;
		case 'f':System.out.println("u r female");
                 break;
		case 'o':System.out.println("u r transgender");
                 break;   
        default :System.out.println("enter valid gender");         
		}

		
	}

}
