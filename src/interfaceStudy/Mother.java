package interfaceStudy;

public interface Mother {
	
	void look();
	void recipe();
	default void love()
	{
		System.out.println("Mother love");
	}
	
	static void reputation() {
		System.out.println("My mother is farmer");
	}

}
