package function;

public class factorial {
	
	public static int factorial(int n) {
		int fact=1;
		for(int i=1; i<=n; i++) {
			fact=fact*i;
		}
		return  fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=factorial(5);
		System.out.println(fact);
	}

}
