import java.util.Scanner;
/** 
 * calculate x to the power of n
 */

public class Power {
    /**
     * calculates x to the power of n
     * @param double x to the power of nonnegative integer n
     * @return x to the power of n
     */
    public static double power(double x, int n) {
        if (n == 0) {
            return 1.0;               //any number to the power of 0 is 1
        } else if (n % 2 == 0) {
            return power(x, n / 2) * power(x, n / 2);           //more effecient if n is even
        } else {
            return x * power(x, n - 1);
        }
    }
    
    public static void main(String[] args) {
        double x, result;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Calculate x to the power of n.");
        System.out.print("x? ");
        if(!in.hasNextDouble()) {                                //checks if x is a double
            String wrong = in.next();
            System.err.printf("%s is not a double. UNACCEPTABLE!\n", wrong);
            return;
        }
        x = in.nextDouble();
        
        System.out.print("n? ");
        if(!in.hasNextInt()) {                                 //checks if n is an integer
            String wrong = in.next();
            System.err.printf("%s is not an integer. UNACCEPTABLE!\n", wrong);
            return;
        }
        n = in.nextInt();
        if (n < 0) {                                            //checks if n is nonnegative
            System.err.println("n is negative. UNACCEPTABLE!");
            return;
        }
        
        result = power(x, n);
        System.out.println(result);
    }
}