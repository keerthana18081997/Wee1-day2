package Assignments;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String str="stops";
		String str1="topss";
		
		if(str.length()==str1.length()) {
			char[] a=str.toCharArray();
			char[] b=str1.toCharArray();
			
			Arrays.sort(a);
			Arrays.sort(b);
			int c=0;
			for(int i=0;i<a.length;i++) {
				if(a[i]==b[i])
					c++;
				
			}
			if(c==a.length)
				System.out.println("both strings are same");
			else
				System.out.println("both the strings are not same");
				
		}
	}

}
