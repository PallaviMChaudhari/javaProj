   package arrayStudy;

import java.util.Scanner;

public class ArrayStudy {

	public static void main(String[] args) {
		System.out.println("enter the String :");
		Scanner ip=new Scanner(System.in);
		String str1=ip.nextLine();
		
		System.out.println("Given String is palindrome ?");
		char a[]=str1.toCharArray();
	
		char b[]=new char[a.length];
		
		for(int i=0;i<=a.length-1;i++) {
			b[i]=a[a.length-1-i];
		}
		System.out.println("reverse String is :");
		System.out.print(b);
		System.out.println();
		String str2=new String(b);
		if(str1.equals(str2)==true) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
		
		System.out.println("============================");
		
		
		ip.close();
		
	}

}
