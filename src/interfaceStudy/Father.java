package interfaceStudy;

public interface Father {
	
	 void money();
	 void property();
	 default void love()
	 {
		 System.out.println("Father love"); 
	 }
	  static void reputation() {
		  System.out.println("My father is farmer");
	  }
	
	

}
