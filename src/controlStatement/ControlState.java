package controlStatement;

public class ControlState {

	public static void main(String[] args) {
		//if age is grater than 18 then you are eligible for voting
		//if age is grater than 21 then you are eligible for voting as well as marriage
		//else you are not eligible for marriage
		//else you are not eligible for voting 
		
		System.out.println("=========Example 1================");
		
		float age=25;
		
		if(age>=18) {
			System.out.println("YOU ARE ELIGIBLE FOR VOTING....");
			
			if(age>=21) {
				System.out.println("YOU ARE ELIGIBLE FOR VOTING AS WELL AS MARRIAGE..");	
			}
			
			else {
				System.out.println("YOU ARE NOT ELIGIBLE FOR MARRIAGE..");
			}			
		}
		else {
			System.out.println("YOU ARE NOT ELIGIBLE FOR VOTING..");
		}
		
		//switch case for days in week
		
		System.out.println("=========Example 2================");
		String day="sunday";
		
		switch(day) {
		
		case "monday":{
			System.out.println("Today is 1st week day ");
			System.out.println("Dress code is :Red");
			break;
		}
		case "tuesday":{
			System.out.println("Today is 2nd week day ");
			System.out.println("Dress code is :Pink");
			break;
		}
		case "wednesday":{
			System.out.println("Today is 3rd week day ");
			System.out.println("Dress code is :Violet");
			break;
		}
		case "thurday":{
			System.out.println("Today is 4th week day ");
			System.out.println("Dress code is :Yellow");
			break;
		}
		case "friday":{
			System.out.println("Today is 5th week day ");
			System.out.println("Dress code is :Green");
			break;
		}
		case "saturday":{
			System.out.println("Today is 6th week day ");
			System.out.println("Dress code is :Blue");
			break;
		}
		case "sunday":{
			System.out.println("Today is weekend day ");
			System.out.println("Wear dress colour you like.... ");
			break;
		}
		default:{
			System.out.println("plzz Enter valid day in week ... ");
		}
			
		} 
		
		//switch case for gender 
		System.out.println("=========Example 3================");
		
		char gender='f';
		switch (gender) {
		case 'm': {
			System.out.println("YOU ARE MALE...");
			break;
		}
		case 'f': {
			System.out.println("YOU ARE FEMALE...");
			break;
		}
		case 'o': {
			System.out.println("YOU ARE TRANSGENDER...");
			break;
		}
		
		default:
			System.out.println("Enter valid gender value...");
		}
		
		//ex4 switch case for Operation
		System.out.println("==========Example 4==============");
		
		int a=50; int b=5;
		String operation="multiplication";
		
		switch (operation) {
		case "addition":{
			int sum=a+b;
			System.out.println("Addition :"+sum);
			break;
		}
		case "substraction":{
			int sub=a-b;
			System.out.println("Substraction :"+sub);
			break;
		}
		case "multiplication":{
			int mul=a*b;
			System.out.println("Multiplication :"+mul);
			break;
		}
		case "division":{
			int div=a/b;
			System.out.println("Division :"+div);
			break;
		}
			
		default:
			break;
		}
		
		
	}

}
