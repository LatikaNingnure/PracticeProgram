package arrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CustomArrayList extends ArrayList {
	
	public boolean add(Object o) {
		if(this.contains(o)) {
			return true;
		} else {
			return super.add(o);
		}
	}
	
	
	public static void main(String[] args) {
		
		CustomArrayList list=new CustomArrayList();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		System.out.println(list);
		
		Set<String> set=new HashSet<String>();
		//list.forEach(list1->System.out.println(list1));
		
		Iterator it= list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next()+" ");
			
			
			
			
		
		}
			
		
		
			
		
	}
}
