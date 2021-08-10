package Assignments;

public class Calculator {
	public static void main(String[] args) {
		Mycalculator obj= new Mycalculator();
		int add=obj.sum();
		System.out.println("sum of num1 and num2 = " +add);
		
        obj.subtraction();
        
        int sub=obj.mutiplicaton();
        System.out.println("multiplication of num1 and num2 = " +sub);
		int division=obj.division();
		System.out.println("division of num1 and num2 = " +division);
	}
}
