package streamApi;

import java.util.HashMap;
import java.util.Iterator;



public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("Latika", 10);
		hm.put("Prajkata", 20);
		hm.put("Aishu", 20);
		hm.put("Pranjal", 50);
		//System.out.println(hm);
		
		Iterator hminterator=hm.entrySet().iterator();
		while(hminterator.hasNext()) {
			System.out.println(hminterator.next());
		}
		
		//hm.forEach((s,i)->System.out.println(s+":" +i));
	
		
	}
	

}
