import java.math.BigInteger;

/**
 * calculating factorial with BigInteger
 */
public class Big {
    public static BigInteger factorial(int n) {
        BigInteger factorial = BigInteger.valueOf(n);
        for (int i = 1; i < n; i++) {
            BigInteger mult = BigInteger.valueOf(i);
            factorial = factorial.multiply(mult);
        }
        return factorial;
    }
    
    public static void main(String[] args) {
        for (int i = 0; i < 31; i++) {
            System.out.println(i + "\t" + factorial(i));
        }
    }
}