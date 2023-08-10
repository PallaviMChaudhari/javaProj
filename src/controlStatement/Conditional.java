package controlStatement;

public class Conditional {

	public static void main(String[] args) {
		
		System.out.println("===========Example 1=============");
		//Ex1.if age is grater than or equal to 18 then eligible for voting 
        int age=29;	
		if(age>=18) {
			System.out.println("Eligible for voting in india");        	
        }
		else {
			System.out.println("Not eligible for voting in india");
		}
		
		System.out.println("===========Example 2=============");
		
		//Ex2. if marks is grater than or equal to 40 and less than 50 then you got pass class 
		//if marks 50 is grater than or equal to 50 and less than 60 then you got 2nd class
		//if marks is grater than or equal to 60 and less than 65 then you 1st class 
		//if marks is grater than or equal to 65 you got distinction class
		//else you are fail
		float marks=72.6f;
		
		if (marks>=40 && marks<50) {
			System.out.println("You are PASS ");
			System.out.println("YOU GOT PASS CLASS...");
		}
		
		else if(marks>=50 && marks<60) {
			System.out.println("You are PASS ");
			System.out.println("YOU GOT 2ND CLASS....");
		}
		
		else if(marks>=60 && marks<65){
			System.out.println("You are PASS ");
			System.out.println("YOU GOT 1ST CLASS....");
			
		}
		
		else if(marks>=65) {
			System.out.println("You are PASS ");
			System.out.println("YOU GOT DISTINCTION CLASS....");
		}
		
		else {
			System.out.println("You are FAIL ");
		}
		
		System.out.println("===========Example 3=============");
		//Ex3.if button is on then fan is start
		
		String button="OFF";
		if(button=="ON") {
			System.out.println("Fan is START...");
		}
		else {
			System.out.println("Fan is STOP...");
		}
		
		System.out.println("===========Example 4=============");
		 //ex4. if gender is M then you are male 
		//if gender is F you are female
		char gender ='f';
		
		if(gender=='f') {
			System.out.println("You are Female");
		}
		else {
			System.out.println("You are Male");
		}
		
	}

}
