package string;

import java.util.Arrays;

public class Anagram {
		public static void main(String[] args) {
			String str1="latika";
			String str2="ltkaai";
			
			if(str1.length()!=str2.length()) {
				System.out.println("Both String are not anagram");
			} else {
				str1=str1.toLowerCase();
				str2=str2.toLowerCase();
				char ch1[]=str1.toCharArray();
				char ch2[]=str2.toCharArray();
				Arrays.sort(ch1);
				Arrays.sort(ch2);
				if(Arrays.equals(ch1, ch2)) {
					System.out.println("Both String are anagram");
				} else {
					System.out.println("Both Stirng are not anagram");
				}
			}
		}
}
