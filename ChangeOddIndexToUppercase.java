package Assignments;

public class ChangeOddIndexToUppercase {
	public static void main(String[] args) {
		String str="changeme";
		
		char[] newstring=str.toCharArray();
		
		for(int i=0;i<newstring.length;i++) {
			if(i%2==0) {
				newstring[i] = Character.toLowerCase(newstring[i]);
			}
			else {
				newstring[i] = Character.toUpperCase(newstring[i]);
			}
		}
		System.out.println(new String(newstring));
	}

}
