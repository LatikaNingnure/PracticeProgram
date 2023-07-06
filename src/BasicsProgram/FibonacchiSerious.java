package BasicsProgram;

public class FibonacchiSerious {
	
	public static void main(String[] args) {
		
		int n=10;
		int first=0, second=1;
		System.out.print(first+" "+second+" ");
		for(int i=2; i<=n; i++) {
			int third=first+second;
			System.out.print(third+" ");
			first=second;
			second=third;
			
		}
	}

}
