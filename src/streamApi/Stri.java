
package streamApi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Stri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list= new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		System.out.println(list.stream().collect(Collectors.toList()));
		System.out.println();
				
		Iterator<String> it= list.iterator(); 
		while(it.hasNext()) {
			System.out.print(it.next());
		}
		System.out.println();
		for (String string : list) {
			System.out.print(string+", ");
		}
		

	}

}
