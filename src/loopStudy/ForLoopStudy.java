package loopStudy;

public class ForLoopStudy {

	public static void main(String[] args) {

	   for(int i=1;i<=12;i++)
	   {
		  if(i==12)
		  {
			System.out.println("1st shift :"+i+"pm");
			for(int j=1;j<12;j++)
			{
				System.out.println("2nd shift :"+j+"pm");
			}
			System.out.println("1st shift :"+i+"am");
					
		  }
		  else 
		  {
		    System.out.println("1st shift :"+i+"am");
		  }			
        }
	}
}
