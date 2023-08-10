package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class StudyOfVector {

	public static void main(String[] args) {
		Vector<Character> v=new Vector<>();
		v.add('a');
		v.add('b');
		v.add('c');
		v.add('d');
		v.add('f');
		v.add(4,'e');
		v.add(null);
		v.add('e');
		System.out.println(v);
		
		System.out.println(v.capacity());
		
		Object a = v.clone();
		System.out.println("Clone of v"+a);
		
		System.out.println(v.contains('b'));
		
		System.out.println(v.elementAt(3));
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		System.out.println(v.get(4));
		System.out.println(v.indexOf('b'));
		System.out.println(v);
		System.out.println(v.indexOf('d', 2));
		System.out.println(v);
		System.out.println(v.lastIndexOf('e'));
		System.out.println();
		v.remove(7);
		System.out.println(v);
		System.out.println(v.removeElement(null));
		System.out.println(v);
		v.set(3,'h');
		System.out.println(v);
		v.setElementAt('d', 4);
		System.out.println(v);
		System.out.println(v.size());
		//v.setSize(12);
		System.out.println(v);
		System.out.println("==========iterator========");
		Iterator<Character> iv = v.iterator();
		while(iv.hasNext()) {
			System.out.println(iv.next());
		}
		System.out.println("===========listIterator=======");
		ListIterator<Character> lv = v.listIterator();
		while(lv.hasNext()) {
			System.out.println(lv.next());
		}
		
		System.out.println("========for each=========");
		
		for(Character p:v) {
			System.out.println(p);
			
		}
		System.out.println("==============enumaration=========");
		Enumeration<Character> ev = v.elements();
		while(ev.hasMoreElements()) {
			System.out.println(ev.nextElement());
		}
		
	}

}
