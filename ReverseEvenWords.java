package Assignments;

public class ReverseEvenWords {
	public static void main(String[] args) {
		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)

		String test = "I am a software tester"; 
		String[] words=test.split(" ");
		
		String newstring=" ";
		for(int i=0;i<words.length;i++) {
			if(i%2==1) 
				newstring=newstring + new StringBuilder(words[i]).reverse().toString() + " ";
				else
					newstring=newstring + words[i] + " ";
				   
		}	
				newstring = newstring.trim();
				System.out.println(newstring);
		
	}
}