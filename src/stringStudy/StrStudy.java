package stringStudy;

//import java.util.stream.IntStream;

public class StrStudy {

	public static void main(String[] args) {
		String str1="moksh";
		String str2="MOKSH";
		String str3="moksh";
		String str4=new String("riddhi");
		String str5=new String("riddhi");
		String str6="";
		//String str7=null;
		
		System.out.println("=========1.length=========");
		
		System.out.println("length of str1 is :"+str1.length());
		System.out.println("length of str4 is :"+ str4.length());
		
		int a = str5.length();
		System.out.println("length of str5 is :"+a);
		
		int b = str2.length();
		System.out.println("length of str2 is :"+b);
		
		System.out.println("============2.touppercase==================");
		System.out.println(str3.toUpperCase());	
		System.out.println(str5.toUpperCase());
		String c = str5.toUpperCase();
		System.out.println(c);
		
		System.out.println("============3.tolowercase==================");
		System.out.println(str2.toLowerCase());
		String d = c.toLowerCase();
		System.out.println(d);
		
		System.out.println("============4.equals==================");
		System.out.println(str1 == str3);
		System.out.println(str1==str4);
		
		System.out.println("str1 & str3 are equals? :"+str1.equals(str3));
		boolean e = str4.equals(str2);
		System.out.println("str4 & str2 are equals? :"+e);
		
		System.out.println("=============5.equalignorecase==========");
		System.out.println(str1.equalsIgnoreCase(str3));
		boolean f = str4.equalsIgnoreCase(c);
		System.out.println("str4 & c are equal? :"+f);
		
		System.out.println("==============6.contains===============");
		
		boolean g = str4.contains("dd");
		System.out.println(g);
		System.out.println(str1.contains("os"));
		boolean h = str6.contains("a");
		System.out.println(h);
		
		System.out.println("=============7.isEmpty===================");
	
		boolean i = str1.isEmpty();
		System.out.println(i);
		System.out.println(str6.isEmpty()); 
		System.out.println(str6.isBlank());
		
		//boolean k = str7.isEmpty();
		//System.out.println(k);
		
		System.out.println("===============8.charAt================");
		String str7="my name is pallavi";
		
		System.out.println("11 th char is :"+str7.charAt(11));
		
		char j = str7.charAt(5);
		System.out.println("5 th char is :"+j);
		
		System.out.println("===============9.endsWith==============");
		
		System.out.println(str7.endsWith("pallavi"));
		boolean m = str7.endsWith("name");
		System.out.println("string ends with name ?"+m);
		
		System.out.println("===============10.startwith================"); 
		
		System.out.println(str7.startsWith("my"));
		boolean n = str7.startsWith("name", 3);
		System.out.println(n);
		System.out.println(str7.startsWith("pvi", 11));
		
		System.out.println("=============11.subString==================");
		
		System.out.println(str7.substring(11));
		System.out.println(str7.substring(5, 11));
		System.out.println(str7.subSequence(11, 14));
		
		System.out.println("===============12.concat================");
		var str8 = " chaudhari";
		var str9=" manilal chaudhari";
		System.out.println(str7.concat(str8));
		String o = str7.concat(str9);
		System.out.println(o);
		System.out.println("===============13.indexof================");
		System.out.println(str9.indexOf('l'));
		
		
		
		
		
		

	}

}
