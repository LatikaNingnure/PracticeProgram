package string;

public class PunctuationCount {

	public static void main(String[] args) {
		int count=0;
		String str="Hi, I am Latika";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  str.charAt(i) == '?' || str.charAt(i) == '-' ||    
					str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':')  {
				count++;
				
			}
			
			
		}
		System.out.println(count);
	}

}
