package linkedListDemo;

import java.util.LinkedList;

//It uses 

public class LL {
	public static void main(String[] args) {
		LinkedList<String> ll =new LinkedList<>();
		ll.add("am");
		ll.addFirst("I");
		ll.add("java programmer");
		System.out.println(ll);
		
		
		ll.set(2,"python programmer");
		System.out.println(ll);
		//ll.remove("java programmer");
		ll.removeFirst();
		System.out.println(ll);
		
		for(String str: ll) {
			System.out.print(str+" ");
		}
		
	}

}
