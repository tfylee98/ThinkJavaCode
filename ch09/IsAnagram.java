import java.util.Arrays;

/**
 * checks if two strings are anagrams, contain same letters and same numbers of each letter
 */
public class IsAnagram {    
    
    /**
     * checks if String s1 and s2 are anagrams
     */
    public static boolean isAnagram(String s1, String s2) {
        String lowerS1 = s1.toLowerCase();
        String lowerS2 = s2.toLowerCase();
        int[] numChars1 = new int[s1.length()];
        int[] numChars2 = new int[s2.length()];
        int[] counts1 = new int[26];
        int[] counts2 = new int[26];
        
        if (s1.length() != s2.length()) {     //can't be anagrams if length is different
            return false;
        }
        
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            numChars1[i] = (int) c1;          //integer array of unicode c1
            numChars2[i] = (int) c2;          //integer array of unicode c2
            counts1[numChars1[i] - 97]++;     //histogram of letters in s1
            counts2[numChars2[i] - 97]++;     //histogram of letters in s2
        }
        
        for (int i = 0; i < 26; i++) {           //if histograms are different, return false
            if (counts1[i] != counts2[i]) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        boolean resultTrue, resultFalse;
        String str1 = "stop";
        String str2 = "pots";
        String str3 = "coffee";
        resultTrue = isAnagram(str1, str2);
        resultFalse = isAnagram(str1, str3);
        System.out.println(resultTrue + "\t" + resultFalse);
    }
}
    