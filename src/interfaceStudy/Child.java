package interfaceStudy;

public class Child implements Father,Mother
{

	public static void main(String[] args) {
		Child c= new Child();
		c.look();
		c.money();
		c.property();
		c.recipe();
		c.love();
		Father.reputation();
		Mother.reputation();
		var a="abc";
		System.out.println("a is :"+a);
		
	
		
	}

	@Override
	public void look() {
	   System.out.println("My mother is so pretty");
		
	}

	@Override
	public void recipe() {
		System.out.println("My mother cook very tasty food ");
		
		
	}

	@Override
	public void money() {
		System.out.println("my father is very rich");
		
	}

	@Override
	public void property() {
		System.out.println("my father have property");
		
	}

	@Override
	public void love() {
		Father.super.love();
		Mother.super.love();
		
	}
	
	

}
