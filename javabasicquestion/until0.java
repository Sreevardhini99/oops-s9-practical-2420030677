package javabasicquestion;

import java.util.Scanner;

public class until0 {


	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int num;
	        
	        do {
	            num = sc.nextInt();
	            if (num != 0) {
	                System.out.println("You entered: " + num);
	            }
	        } while (num != 0);
	        
	        System.out.println("Program ended.");
	        sc.close();
	    }
	}
	