package lambdaExample;

@FunctionalInterface
interface myInterface{
	public void sum();
}

public class example {
	
	/*public void sum() {
		System.out.println("Sum of two no");
	}*/
	
	public static void main(String[] args) {
		
		//lambda function
		myInterface in=() -> System.out.println("sum method called");
		in.sum();
	}

}
