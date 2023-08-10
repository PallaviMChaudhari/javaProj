package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList_Study {
	public static void main(String[] args) throws InterruptedException {
		
		ArrayList<Integer> al=new ArrayList<>();
		System.out.println(al); 
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(null);
		al.add(4, 5);
		
		System.out.println(al);
		
		//al.clear();
		//System.out.println(al);
		
		 Object alClone = al.clone();
		 
		 System.out.println("Clone Arraylist is :"+alClone);
		 
		 al.add(6);
		 al.add(6);
		 
		 boolean a = al.contains(4);
		 
		 System.out.println("is al contains 4 or not ?"+a);
		 
		System.out.println(al.equals(alClone));
		
		Object b = al.get(4);
		System.out.println(b);
		
		System.out.println(al.indexOf(null));
		
		System.out.println(al.isEmpty());
		
		System.out.println(al);
		System.out.println(al.lastIndexOf(6));
		
		System.out.println(al.remove(6));
		System.out.println(al);
		
		System.out.println(al.remove(null));
		
		//System.out.println(al.removeAll(al));
		System.out.println(al);
		
		al.set(5, 2);
		System.out.println(al);
		
		int c = al.size();
		System.out.println(c);
		
		List<Integer> sl = al.subList(3, 5);
		System.out.println(sl);
		
		System.out.println("==============array================");
		
		Object[] d = al.toArray();
		for(int i=0;i<=d.length-1;i++ ) {
		System.out.println(d[i]);
		}
		
		System.out.println("==========for loop==========");
		
		System.out.println(al); 
		
		for(int i=0;i<=al.size()-1;i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("============for each===========");
		
		for(Integer l:al) {
			System.out.println(l);
		}
		
		System.out.println("============iterator============");
		Iterator<Integer> it=al.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("==========iterator List========");
		
		ListIterator<Integer> t=al.listIterator();
		while(t.hasNext()) {
			System.out.println(t.next());
		}
		
		
		
		
		

	}

}
