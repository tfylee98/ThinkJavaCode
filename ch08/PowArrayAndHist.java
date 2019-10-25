import java.util.Random;
import java.util.Arrays;

/**
 * practicing encapsulation and generalization
 */
public class PowArrayAndHist {
    
    /**
     * raises all elements in an array to the nth power
     * @param a: array of doubles
     * @param n: raise all elements in a to the power of n
     * @return the changed array a[i]^n
     */
    public static double[] powArray(double[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.pow(a[i], n);
        }
        return a;
    }
    
    /**
     * counts how many times each score in a range appears
     * @param int[] scores: an array of integers, ranging from 0 to (range - 1) inclusive
     * @param range: range of scores, also determines counts.length
     * @return histogram counts
     */
    public static int[] histogram(int[] scores, int range) {
        int[] counts = new int[range];
        for (int score : scores) {
            counts[score]++;
        }
        return counts;
    }
    
    /** 
     * produces a random array of size size, with integer elements ranging from 0 to (range - 1)
     * @param size: a.length
     * @param range: range of integers for elements of a
     * @return random array a
     */
    public static int[] randomArray(int size, int range) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(range);
        }
        return a;
    }
        
    
    public static void main(String[] args) {
        double[] a = new double[5];
        int power = 3;
        double[] results;
        
        int range = 10;
        //note that the range for scores and counts must be the same
        //otherwise, ArrayIndexOutOfBoundsException is thrown
        int[] scores = randomArray(10, range);
        int[] counts = histogram(scores, range);
        
        //initializing array of doubles with length 5
        //a = [0, 1, 2, 3, 4]
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        
        //raising all elements in a to the 3rd power
        results = powArray(a, power);
        
        System.out.println(Arrays.toString(results));
        System.out.println(Arrays.toString(scores));
        System.out.println(Arrays.toString(counts));
    }
}