package arrays;
import java.util.*;
public class averageofstudent {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int marks[]=new int [size];
	int total=0;
	  System.out.println("Enter marks for 6 subjects:");
	for(int i=0;i<6;i++) {
		marks[i] = sc.nextInt();
		
		 total += marks[i];
	}
		int  average = total / 6;

	        System.out.println("\nTotal Marks: " + total);
	        System.out.println("Average Marks: " + average);

	        sc.close();


}
}