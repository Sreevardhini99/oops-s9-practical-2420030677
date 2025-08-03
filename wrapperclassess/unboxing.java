package wrapperclasess;

public class unboxing {
	public static void main(String[] args) {
        Integer boxedInt = new Integer(200);
        int primitiveInt = boxedInt.intValue();  
        System.out.println("Unboxed int: " + primitiveInt);
}
}