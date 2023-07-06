package collectionframework;

import java.util.ArrayList;
import java.util.Collections;

public class DemoArrayList {
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		
		list.add(0);
		list.add(1);
		list.add(3);
		
		System.out.println(list);
		
		System.out.println("get element "+list.get(2));
		
		list.add(1,5);
		System.out.println("Add between two element "+list);
		
		list.set(0,4);
		System.out.println("set element "+list);
		
		list.remove(3);
		System.out.println("Remove elements in arraylist "+list);
		
		System.out.println("Size of ArrayList " +list.size());
		
		
		for(int s: list) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		Collections.sort(list);
		System.out.println("Sorted ArrayList "+ list);
	}

}
