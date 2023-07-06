package map;

import java.util.*;

public class Hashmap {
	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap<>();
		
		//adding element
		map.put("India", 180);
		map.put("China",200);
		map.put("Indpnashiya",50);
		
		System.out.println(map.get("India"));
		
		for(Map.Entry<String, Integer> e: map.entrySet()) {
			System.out.println(e);
		}
		
		
	}

}
