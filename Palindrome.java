package Assignments;

public class Palindrome {
	
	public static void main(String[] args) {
	String str="MADAM";
	String rev="";
	
	for(int i=str.length()-1;i>=0;i--) 
	rev=rev+str.charAt(i);
	if(str.equals(rev)) {
		System.out.println("it is palindrome" +rev);
	}
	else {
		System.out.println("it is not a palindrome" +rev);
	}
	
}
}
