package practice;

public class StringStudy {

	public static void main(String[] args) {
		String str1="pallavi";
		String str2="ridhhi";
		
		System.out.println("Length"+str1.length());
		
		System.out.println("is equals? "+str1.equals(str2));
		
		System.out.println("is empty ?"+str1.isEmpty());
		
		System.out.println("index of :"+str1.indexOf('a'));
		
		System.out.println("last index of :"+str1.lastIndexOf('a'));
		
		System.out.println("concat :"+str1.concat(str2));
		
		System.out.println("touppercase :"+str1.toUpperCase());
		
		System.out.println("toLowercase :"+str1.toLowerCase());
		
		System.out.println("contains :"+str1.contains("vi"));
		
		System.out.println("char at :"+str1.charAt(5));
		
		System.out.println("ends with :"+str1.endsWith("vi"));
		
		System.out.println("replace :"+str1.replace('a', '@'));
		
		String str3="my name is pallavi manilal chaudhai";
		String str4=" ";
		
		String a[]=str3.split(str4);
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
			
		}
		
	
		
		
		
		
	}

}
