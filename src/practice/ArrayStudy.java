package practice;

public class ArrayStudy {

	public static void main(String[] args) {
		String a[]=new String[5];
		a[0]="pallavi";
		a[1]="priya";
		a[2]="kalyani";
		a[3]="sagar";
		a[4]="ridhhi";
		
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}
		
		String p="pallavi";
		char b[]=p.toCharArray();
		
		char c[]=new char[b.length];
		
		for(int i=0;i<=b.length-1;i++) {
			//c[i]=b[b.length-1-i];
			c[i]=p.charAt(p.length()-1-i);
			
		}
		
		System.out.println(c);

	}

}
