package Assignments;

public class FindInteraction {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,11};
		int[] b= {11,12,13,14,15,6};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.println("Interaction =" +b[j]);
				}
			}
	}
}
}
