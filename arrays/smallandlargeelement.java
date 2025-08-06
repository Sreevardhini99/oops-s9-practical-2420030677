package arrays;
import java .util.*;
public class smallandlargeelement {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int arr[]= new int [size];
	System.out.println("Enter " + size + " elements:");
  for(int i=0;i<5;i++)	{
		arr[i]=sc.nextInt();
	}
	
		int smallest = arr[0];
        int largest = arr[2];

        // Loop to find smallest and largest
        for (int i = 1; i < 5; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            if (arr[i] > largest) {
                largest = arr[i];
	
	
	
                System.out.println("Smallest Element: " + smallest);
                System.out.println("Largest Element: " + largest);

	}
	
}
}
}
