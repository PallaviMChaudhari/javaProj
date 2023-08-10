package arrayStudy;

import java.util.Arrays;

public class StudyOfArray {

	public static void main(String[] args) {
		//declare int array with new keyword 
		
		int roll_no[]=new int[5];
		roll_no[0]=1;
		roll_no[1]=5;
		roll_no[2]=4;
		roll_no[3]=2;
		roll_no[4]=3;
		
		System.out.println(roll_no[0]);
		System.out.println(roll_no[1]);
		System.out.println(roll_no[2]);
		System.out.println(roll_no[3]);
		System.out.println(roll_no[4]);
		
		System.out.println("============================");
		
		for(int i=0;i<=roll_no.length-1;i++) {
			System.out.println(roll_no[i]);
		}
		
		Arrays.sort(roll_no);
		
		for(int i=0;i<=roll_no.length-1;i++) {
			System.out.println(roll_no[i]);
		}
		
		//declare int array without new keyword
		System.out.println("===============================");
		
		int numbers[]= {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0;i<=numbers.length-1;i++) {
			System.out.print(numbers[i]+" ");
		}
		System.out.println();
		
		System.out.println("==============================");
		//declare string array with new keyword
		
		String name[]=new String[6];
		name[0]="Pallavi";
		name[1]="Sagar";
		name[2]="Priya";
		name[3]="Kali";
		name[4]="Piyush";
		name[5]="Moksh";
		
		System.out.println(name[0]);
		System.out.println(name[4]);
		System.out.println(name[2]);
		
		System.out.println("===================================");
		
		for(int i=0;i<=name.length-1;i++) {
			System.out.println(name[i]+" ");
		}
		
		Arrays.sort(name);
		System.out.println("================================");

		for(int i=0;i<=name.length-1;i++) {
			System.out.println(name[i]+" ");
		}
		
		System.out.println("==============================");
		
		String directions[]= {"North","South","East","West"};

		for(int i=0;i<=directions.length-1;i++) {
			System.out.println(directions[i]+" ");
		}
		System.out.println("==========================");
		
		Arrays.sort(directions);
		for(int i=0;i<=directions.length-1;i++) {
			System.out.println(directions[i]+" ");
		}
		
		System.out.println("==============================");
		//declare char array by using new keywords
		
		char gender[]=new char[3];
		gender[0]='M';
		gender[1]='F';
		gender[2]='O';
		
		System.out.println(gender[1]);
		System.out.println("======================");
		
		for(int i=0;i<=gender.length-1;i++) {
			System.out.println(gender[i]);
		}
		
		//declare char array without new keyword
		
		char division[]= {'A','B','C','D','E'};
		
		System.out.println(division[3]);
		System.out.println(division[1]);
		
		System.out.println("=========================");
		
		for(int i=0;i<=division.length-1;i++) {
			System.out.println(division[i]);
		}
		
		//declare multi dimension array with new keyword
		System.out.println("=====declare multi dimension array=====");
		
		int A[][]=new int[3][3];
		A[0][0]=1;
		A[0][1]=2;
		A[0][2]=3;
		A[1][0]=4;
		A[1][1]=5;
		A[1][2]=6;
		A[2][0]=7;
		A[2][1]=8;
		A[2][2]=9;
		
		for(int i=0;i<=A.length-1;i++) {
			for(int j=0;j<=A.length-1;j++) {
				System.out.print(A[i][j]+" ");
				
			}
			
			System.out.println();
		}
		System.out.println("===============================");
		
		char mat[][]= {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
		
	
		for(int i=0;i<=mat.length-1;i++) {
			for(int j=0;j<=mat.length-1;j++) {
				System.out.print(mat[i][j]+" ");
				
			}
		   System.out.println();
		}
		
		
	}

	
}
