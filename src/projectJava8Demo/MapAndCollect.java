package projectJava8Demo;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class MapAndCollect {
	
	public static void main(String[] args) {
		Set<Customer> customers=new HashSet<>();
		customers.add(new Customer(1, "Latika", "Latika@gmail.com"));
		customers.add(new Customer(2, "Latika", "Latika@gmail.com"));
		customers.add(new Customer(3, "Latika", "Latika@gmail.com"));
		customers.add(new Customer(3, "Latika", "Latika@gmail.com"));
		
		
		Set<CustomerDTO> cDTO= customers.stream().map(e-> {
										CustomerDTO cDto= new CustomerDTO(e.getcID(), e.getcName(),e.getcEmail());
		       							return cDto;
							}).collect(Collectors.toSet());			
		
		cDTO.forEach(c -> System.out.println(c.getcId()));
		
		
		
	}

}
