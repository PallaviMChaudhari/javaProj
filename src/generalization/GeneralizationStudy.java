package generalization;

public class GeneralizationStudy {

	public static void main(String[] args) {
		BHIM b=new BHIM();
		b.B2B();
		b.BalCheck();
		b.M2M();
		b.Recharge();
		
		PhonePay p=new PhonePay();
		p.B2B();
		p.BalCheck();
		p.M2M();
		p.selfTransfer();
	}

}
