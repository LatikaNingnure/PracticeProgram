package string;

public class CountTotalNumberOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sc="Latika";
		String sc1="Ningnure";
		String sc3=sc.concat(sc1);
		int count=0;
		char ch[]=sc3.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			count++;
		}
		System.out.println(count);

	}

}
