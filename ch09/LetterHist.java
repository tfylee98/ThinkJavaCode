import java.util.Arrays;

/**
 * return histogram of characters in a string
 * 0th element of histogram contains # a's, 1st element contains # b's, and so on
 */
public class LetterHist {
    
    /**
     * create histogram of characters in a string
     * @param String s: count how many times each element in s shows up
     * @return histogram of characters in s
     */
    public static int[] letterHist(String s) {
        int[] hist = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            int charCode = ((int) letter) - 97;         //in unicode, alphabet is 97 - 122;
            hist[charCode]++;                           //we want 0 - 25
        }
        return hist;
    }
    
    public static void main(String[] args) {
        int[] result = new int[26];
        System.out.println(Arrays.toString(args));         //converts command line input to String
        for (String arg : args) {
            result = letterHist(arg);
        }
        System.out.println(Arrays.toString(result));
    }
}
            