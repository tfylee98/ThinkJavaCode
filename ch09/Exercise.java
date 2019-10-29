import java.util.Arrays;

/**
 * Exercise on encapsulation and generalization.
 */
public class Exercise {
    
    /**
     * checks if string is balanced
     * @param checks string s
     * @param char c1: for every appearance of c1 in s, count++
     * @param char c2: for every appearance of c2 in s, count--
     * @return count
     */
    public static int balance(String s, char c1, char c2) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == c1) {
                count++;
            } else if (c == c2) {
                count--;
            }
        }
        return count;
    }
        
    public static void main(String[] args) {
        int count = 0;
        System.out.println(Arrays.toString(args));
        for (String arg : args) {
            count = balance(arg, 'a', 'b');
        }
        System.out.println(count);
    }
}
