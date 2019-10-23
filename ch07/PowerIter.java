import java.util.Scanner;
/** 
 * calculate x to the power of n using iterative method
 */

public class PowerIter {
    /**
     * calculates x to the power of n
     * @param double x to the power of nonnegative integer n
     * @return x to the power of n
     */
    public static double power(double x, int n) {
        double result = 1.0;
        int i = 1;
        while (i <= n) {
            result = result * x;
            i++;
        }
        return result;
    }
    
    public static void main(String[] args) {
        double x, result;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Calculate x to the power of n.");
        System.out.print("x? ");
        while (!in.hasNextDouble()) {                           //checks if x is a double
            String wrong = in.next();
            System.err.printf("%s is not a double. UNACCEPTABLE!\n", wrong);
            System.out.print("x? ");
        }
        x = in.nextDouble();
        
        System.out.print("n? ");
        while(!in.hasNextInt()) {                               //checks if n is an int
            String wrong = in.next();
            System.err.printf("%s is not an integer. UNACCEPTABLE!\n", wrong);
            System.out.print("n? ");
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