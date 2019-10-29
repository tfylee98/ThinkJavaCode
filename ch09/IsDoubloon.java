import java.util.Arrays;

/**
 * checks if string is doubloon (every letter in string shows up exactly twice)
 */
public class IsDoubloon { 
    
    /**
     * checks if String s is a doubloon
     */
    public static boolean isDoubloon(String s) {
        String lowerS = s.toLowerCase();
        int[] numChars = new int[s.length()];
        int[] counts = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            numChars[i] = (int) c;
            counts[numChars[i] - 97]++;            //histogram of letters in s
        }
        for (int i = 0; i < 26; i++) {
            if (counts[i] != 0 && counts[i] - 2 != 0) {        //checks if letters show up exactly twice
                return false;
            } 
        }
        return true;
    }
    
    public static void main(String[] args) {
        boolean result;
        System.out.println(Arrays.toString(args));
        for (String arg : args) {
            result = isDoubloon(arg);
            System.out.println(result);
        }
    }
}