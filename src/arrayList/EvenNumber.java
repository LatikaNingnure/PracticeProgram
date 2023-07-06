package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EvenNumber {
	
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		List<Integer> s=Arrays.asList(1,2,3,3,5,6,7,8,5,6,7);
		
		List<Integer> evenNumber= s.stream().filter(e-> e%2==0).collect(Collectors.toList());
		System.out.println("Even number with duplicates : "+ evenNumber);
	    // s.stream().filter(e-> e%2==0).forEach(System.out::println);
		Set<Integer> set1=s.stream().filter(e-> e%2==0).collect(Collectors.toSet());
		System.out.println("Even number with unique objects :"+ set1);
	     
		System.out.println();
		List<Integer> l=s.stream().filter(e->e%2!=0).collect(Collectors.toList());
		System.out.println("Odd number with duplicates : "+l);
		
	    Set<Integer> set=s.stream().filter(e-> e%2!=0).collect(Collectors.toSet());
	    System.out.println("Odd numbers with unique objects :" +set);
		
	}

}
