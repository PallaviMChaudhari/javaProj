package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class StudyOfArrayList {

	public static void main(String[] args) {
	
		ArrayList<Object> al=new ArrayList<>();
		System.out.println(al);
		al.add("pallavi");
		al.add(5);
		al.add('f');
		al.add("chaudhari");
		al.add(25.26);
		al.add(29.8f);
		al.add(null);
		al.add(null);
		al.add("moksh");
		al.add(11);
		al.add('m');
		System.out.println(al);
		
		al.add(1,"manilal");
		System.out.println("Arraylist is :"+al);
		//al.clear();
		//System.out.println(al);
		System.out.println("====================================");
		Object alClone = al.clone();
		System.out.println("Clone Arraylist :"+alClone);
		
		System.out.println("is contains null :"+al.contains(null));
		System.out.println("is contains manilal :"+al.contains("manilal"));
		
		System.out.println(al.containsAll(al));
		
		System.out.println("===========================");
		
		System.out.println("is equal :"+al.equals(alClone));
		
		System.out.println(al.get(1));
		
		System.out.println("index of pallavi :"+al.indexOf("pallavi"));
		 
		System.out.println(al.isEmpty());
		
		System.out.println("last index of :"+al.lastIndexOf(null));
		
		System.out.println(al.remove(6));
		
		System.out.println(al);
		
		System.out.println(al.set(5, "all"));
		
		System.out.println(al); 
		
		System.out.println(al.size());
		
		System.out.println(al);
		
		System.out.println(al.subList(5, 8));
		
		System.out.println("=============for loop===============");
		
		for(int i=0;i<=al.size()-1;i++) {
		   System.out.println(al.get(i));
		}
		
		System.out.println("=============for each============");
		
		for(Object a:al) {
			
			System.out.println(a);
			
		}
		
		System.out.println("==========Iterator=========");
		
		Iterator<Object> t=al.iterator();
		
		while(t.hasNext()) {
			System.out.println(t.next());
		}
		
		System.out.println("============List Iterator==============");
		
		ListIterator<Object> tl=al.listIterator();
		while(tl.hasNext()) {
			System.out.println(tl.next());
		}
		
	}

}
