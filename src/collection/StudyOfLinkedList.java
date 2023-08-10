package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class StudyOfLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		
		System.out.println(ll);
		ll.addFirst(0);
		System.out.println(ll);
		System.out.println(ll.element());
		System.out.println(ll.offer(7));
		System.out.println(ll);
		System.out.println(ll.peek());
		System.out.println(ll); 
		System.out.println(ll.peekLast());
		System.out.println(ll.poll());
		System.out.println(ll);
		System.out.println(ll.pollLast());
		System.out.println(ll);
	
		System.out.println("=========iterator==========");
		Iterator<Integer> ln = ll.iterator();
		while(ln.hasNext()) {
			System.out.println(ln.next());
		}

	}

}
