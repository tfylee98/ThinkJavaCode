import java.util.Arrays;

/**
 * Recursion exercise.
 */
public class Recurse {

    /**
     * Returns the first character of the given String.
     */
    public static char first(String s) {
        return s.charAt(0);
    }

    /**
     * Returns all but the first letter of the given String.
     */
    public static String rest(String s) {
        return s.substring(1);
    }

    /**
     * Returns all but the first and last letter of the String.
     */
    public static String middle(String s) {
        return s.substring(1, s.length() - 1);
    }

    /**
     * Returns the length of the given String.
     */
    public static int length(String s) {
        return s.length();
    }
    
    /**
     * displays letters of String s, one on each line
     * only uses previous methods
     */
    public static void printString(String s) {
        int sLength = length(s);
        char firstChar = first(s);
        String restString = rest(s);
        for (int i = 0; i < sLength; i++) {
            if (i == sLength - 1) {
                System.out.println(firstChar);
                continue;
            }
            System.out.println(firstChar);
            firstChar = first(restString);
            restString = rest(restString);
        }
    }
    
    /**
     * does the same thing as printString but displays string backwards
     */
    public static void printBackward(String s) {
        if (length(s) == 1) {
            System.out.println(s);
        } else {
            printBackward(rest(s));
            System.out.println(first(s));
        }
    }
    
    /**
     * returns String s in reverse
     */
    public static String reverseString(String s) {
        String backwards = "";
        for (int i = length(s) - 1; i >= 0; i--) {
            backwards = backwards + s.charAt(i);
        }
        return backwards;
    }
    
    /**
     * checks if String s is a palindrome (reads the same both forwards and backwards)
     */
    public static boolean isPalindrome(String s) {
        boolean result = false;
        if (length(s) == 1) {
            result = true;                         //one letter words are palindromes
        } else if (length(s) == 2) {               //two letter words are palindromes if the letters are the same
            if (s.charAt(0) == s.charAt(1)) {
                result = true;
            } else {
                result = false;
            }
        } else {
            if ((s.charAt(0) == s.charAt(length(s) - 1)) && isPalindrome(middle(s))) {
                result = true;                    //first and last letter are same, and middle is palindrome
            } else {
                result = false;
            }
        }
        return result;
    }
        
    public static void main(String[] args) {
        boolean result;
        String reverse;
        System.out.println(Arrays.toString(args));
        for (String arg : args) {
            reverse = reverseString(arg);
            result = isPalindrome(arg);
            printString(arg);
            printBackward(arg);
            System.out.println(reverse);
            System.out.println(result);
        }
    }
}
