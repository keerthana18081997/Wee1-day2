package Assignments;

import java.util.Arrays;

public class FindSecondLargest {
		
	public static void main(String[] args) {
	
		int a[]= {3,2,11,4,6,7};
	
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.println("second largest = " +a[a.length-2]);
			break;
		}
}
}
