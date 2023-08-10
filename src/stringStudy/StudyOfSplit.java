package stringStudy;

public class StudyOfSplit {

	public static void main(String[] args) {
		String str1=" my : name : is : pallavi : manilal : chaudhari ";
		String str2=":";
		String a[]=str1.split(str2);
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		
		}
		
	}

}
