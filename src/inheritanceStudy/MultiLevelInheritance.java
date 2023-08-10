package inheritanceStudy;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		Hospital.emp();
		Staff s=new Staff();
		s.staffInfo();
		s.facalty();
		s.instrument();
		Staff.emp();
		

	}

}
