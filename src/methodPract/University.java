package methodPract;

public class University {

	public static void main(String[] args) {
		
		Stud_info();      //without parameter Static method call
		University un=new University();   //object create
		un.Stud_info("Riddhi", 5, 'c', 97.3f, 2223 );
		un.Stud_info("Sagar", 2, 'c',90.3f , 24324d);
		un.Stud_info("Kalyani", 8, 'b', 92.7f, 24566);
		un.Stud_info("Priya", 6, 'a',89.5f , 4567);
	
	}
	
	public static void Stud_info() {
		 String Name="Pallavi";
		 char Gender='F';
		 int RollNo=5;
		 float Marks=94.5f;
		 System.out.println("===========================");
		 System.out.println("Student information :");
		 System.out.println("Student Name is :"+Name);
		 System.out.println("Student Gender is :"+Gender);
		 System.out.println("Student Rollno is :"+RollNo);
		 System.out.println("Student Marks is :"+Marks+"%");
		 System.out.println("============================");
	} 
	
	public void Stud_info(String Name,int RollNo,char Division,float Marks,double Rank) {
		System.out.println("===========================");
		 System.out.println("Student information :");
		 System.out.println("Student Name is :"+Name);
		 System.out.println("Student Rollno is :"+RollNo);
		 System.out.println("Student Division is :"+Division);
		 System.out.println("Student Marks is :"+Marks+"%");
		 System.out.println("Student Rank is :"+Rank);
		 System.out.println("============================");
		
	}

}
