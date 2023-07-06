package string;

public class DuplicateCharacter {
	
	public static void main(String[] args) {
		String str="I am latika l i";				
		char str1[]=str.toCharArray();
		int count;
		System.out.println("Duplicate characters and count of characters : ");
		for(int i=0; i<str1.length; i++) {
			count=1;
			for(int j=i+1; j<str.length(); j++) {
				if(str1[i]==str1[j] && str1[j]!=' ') {
					count++;
					str1[j]='0';
				}
				
			}
			if(count>1 && str1[i]!='0') {
				System.out.println(str1[i]+" : "+count);
			}
		}
	}

}
