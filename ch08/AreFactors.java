/**
 * tests if all the numbers in the array are factors of n
 */
public class AreFactors {
    /**
     * tests if all numbers in a are factors of n
     */
    public static boolean areFactors(int n, int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (n % a[i] != 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int n = 12;
        boolean result;
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 7;
        result = areFactors(n, a);
        System.out.println(result);
    }
}