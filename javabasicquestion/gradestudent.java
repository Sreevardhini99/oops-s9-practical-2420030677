package javabasicquestion;

public class gradestudent {
public static void main(String[] args) {
	
	int marks=40;
	if (marks > 100 || marks < 0) System.out.println("Invalid");
    else if (marks >= 90) System.out.println("A");
    else if (marks >= 40) System.out.println("B");
}
}