package Assignments;

import java.util.Arrays;

public class MissingElementsInArray {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,8};
		
		Arrays.sort(arr);
		int a=0;
		for(int i=1;i<arr.length;i++) {
			if(i==arr[a]) {
				a++;
			}
			
			else {
		System.out.println("missing number= "+i);
		break;
	       }
		}
}
}

