package strings;

public class multiplestrings {
	public class StringMethodsExample {
	    public static void main(String[] args) {
	        String original = "  Java Programming Language  ";

	        System.out.println("Original String: '" + original + "'");

	        String trimmed = original.trim();
	        System.out.println("Trimmed: '" + trimmed + "'");

	        System.out.println("Length: " + trimmed.length());
	      
	        System.out.println("Uppercase: " + trimmed.toUpperCase());

	  
	        System.out.println("Lowercase: " + trimmed.toLowerCase());

	        System.out.println("Substring (5 to 16): " + trimmed.substring(5, 16));

	      
	        System.out.println("Replace 'Java' with 'Python': " + trimmed.replace("Java", "Python"));

	     
	        System.out.println("Starts with 'Java'? " + trimmed.startsWith("Java"));

	        System.out.println("Contains 'Program'? " + trimmed.contains("Program"));

	       
	        System.out.println("Character at index 3: " + trimmed.charAt(3));

	       
	        String[] words = trimmed.split(" ");
	        System.out.print("Words: ");
	        for (String word : words) {
	            System.out.print(word + " | ");
	        }
	    }
	}
}
