package wrapperclasess;

public class autounboxing {

	
	
	
	    public static void main(String[] args) {
	        Integer num = 100;
	        int primitiveNum = num;
	        int result = num + 50;
	        System.out.println("Auto-unboxed value: " + primitiveNum);
	        System.out.println("Result after arithmetic operation: " + result);
	    }
	}


