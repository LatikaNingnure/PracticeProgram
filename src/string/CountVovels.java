package string;

public class CountVovels {
	
	public static void main(String[] args) {
		
		String str1="Latika";
		int vCount=0,cCount=0;
		String str=str1.toLowerCase();
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				vCount++;
			} else {
				cCount++;
			}
		}
		System.out.println("Vovles : "+vCount);
		System.out.println("Counsent: "+cCount);
	}

}
