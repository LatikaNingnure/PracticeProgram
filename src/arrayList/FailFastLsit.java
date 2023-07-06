package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastLsit {
	
	
	public static void main(String[] args) {
		
		List<String> list=new CopyOnWriteArrayList<>();
		
		list.add("a");
		list.add("b");
		
		
		Iterator it= list.iterator(); 
		
		while(it.hasNext()) {
			System.out.println(it.next()+" ");
			list.add("c");
		}
		
	}

}
