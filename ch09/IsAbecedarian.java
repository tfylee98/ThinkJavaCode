import java.util.Arrays;

/**
 * checks if string is abecedarian (if all letters in string show up in 
 * alphabetical order)
 */
public class IsAbecedarian {
    
    /**
     * checks if String s is abecedarian
     */
    public static boolean isAbecedarian(String s) {
        for (int i = 0; i < (s.length() - 1); i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i + 1);
            int c1Num = (int) c1;              //converts 1st and 2nd character in s to unicode int
            int c2Num = (int) c2;
            if (c1Num > c2Num) {               //if 1st comes before 2nd in alphabet, return false
                return false;
            } 
        }
        return true;
    }
    
    public static void main(String[] args) {
        boolean result;
        System.out.println(Arrays.toString(args));
        for (String arg : args) {
            result = isAbecedarian(arg);
            System.out.println(result);
        }
    }
}
            