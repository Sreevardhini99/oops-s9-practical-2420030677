package arrays;

public class search {

	

	    public static int search(int[] arr, int target) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == target) {
	                return i;
	            }
	        }
	        return -1;
	    }

	    public static void main(String[] args) {
	        int[] elements = {5, 3, 8, 6, 2};
	        int target = 8;
	        int result = search(elements, target);
	        if (result == -1) {
	            System.out.println("Element not found");
	        } else {
	            System.out.println("Element found at index " + result);
	        }
	    }
	}

	
	
	
	

