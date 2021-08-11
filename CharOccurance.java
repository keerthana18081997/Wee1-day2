package Assignments;

public class CharOccurance {
	public static void main(String[] args) {
		String str="Welcome to chennai";
		int count=0;
		
		char[] a=str.toCharArray();
		int l=a.length;
		
		for(int i=0;i<l;i++) {
			if(a[i]=='e') {
					count++;
				}
		}
			if(count>1)
			System.out.println("occurance of e = " +count);
		}
	}


