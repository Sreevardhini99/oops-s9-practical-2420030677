package javabasicquestion;

public class bitwise {

	 public static void main(String[] args) {
	
	        int a = 12;  
	        int b = 10; 

	        System.out.println("a = " + a + " (" + Integer.toBinaryString(a) + ")");
	        System.out.println("b = " + b + " (" + Integer.toBinaryString(b) + ")");

	        int andResult = a & b;
	        System.out.println("a & b = " + andResult + " (" + Integer.toBinaryString(andResult) + ")");

	        int orResult = a | b;
	        System.out.println("a | b = " + orResult + " (" + Integer.toBinaryString(orResult) + ")");

	        int xorResult = a ^ b;
	        System.out.println("a ^ b = " + xorResult + " (" + Integer.toBinaryString(xorResult) + ")");

	        int complementA = ~a;
	        System.out.println("~a = " + complementA + " (" + Integer.toBinaryString(complementA) + ")");
	    }

}