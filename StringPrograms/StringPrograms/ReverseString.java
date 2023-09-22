package StringPrograms;

public class ReverseString {

	 public static String reverse(String input) 
	 {
	        char[] characters = input.toCharArray();
	        int n = characters.length-1;

	        for (int i = 0; i < n / 2; i++) 
	        {
	            char c = characters[i];
	            characters[i] = characters[n - i];
	            characters[n - i ] = c;
	        }

	        return new String(characters);
	    }

	    public static void main(String[] args)
	    {
	        String text = "educative";
	        System.out.println("Original string - " + text);
	        System.out.println("Reversed string - " + reverse(text));
	    }

}
