import java.util.Arrays;

/**
 * checks if set of tiles can spell word
 */
public class Scrabble {    

    /**
     * checks if set of tiles (s1) can spell word (s2)
     */
    public static boolean canSpell(String s1, String s2) {
        String lowerS1 = s1.toLowerCase();
        String lowerS2 = s2.toLowerCase();
        int[] numChars1 = new int[s1.length()];
        int[] counts1 = new int[26];
        
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            numChars1[i] = (int) c1;
            counts1[numChars1[i] - 97]++;           //histogram of letters in set of tiles
        }
        
        for (int i = 0; i < s2.length(); i++) {     //for each letter in s2,
            char c2 = s2.charAt(i);                 //subtract from histogram of set of tiles
            int numC2 = (int) c2;
            counts1[numC2 - 97]--;                 
        }
        
        for (int i = 0; i < 26; i++) {
            if (counts1[i] < 0) {                   //if any value in histogram is negative,
                return false;                       //then can't spell s2 with available tiles
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        boolean resultTrue, resultFalse;
        String str1 = "abcdefg";
        String str2 = "face";
        String str3 = "coffee";
        resultTrue = canSpell(str1, str2);
        resultFalse = canSpell(str1, str3);
        System.out.println(resultTrue + "\t" + resultFalse);
    }
}