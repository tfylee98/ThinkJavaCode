/**
 * estimating e^x using infinite series expansion
 */
public class MyExp {
    
    /**
    * calculates x * 1 * 2 * ... * (x - 1) = x!
    * @param calculates factorial of integer x
    * @return x!
    */
    public static int factorial(int x) {
        int result = x;
        for (int i = 1; i < x; i++) {
            result = result * i;
        }
        return result;
    }
    
    /**
     * less efficient way to estimate e^x 
     * @param double x for e^x
     * @param estimate e^x with n number of terms in the expansion
     * @return estimated e^x
     */
    public static double myexp(double x, int n) {
        double result = 1.0;
        for (int i = 1; i < n; i++) {
            result = result + (Math.pow(x, i) / factorial(i));
        }
        return result;
    }
    
    /**
     * more efficient way to estimate e^x, gets rid of factorial and Math.pow usage
     * relies purely on iterative method
     * @param double x for e^x
     * @param n number of terms in infinite series expansion
     * @return sum of all n terms in infinite series expansion, should estimate e^x
     */
    public static double myexpeff(double x, int n) {
        double result1 = 1.0;
        double result2 = 0.0; 
        double sum = 1.0;
        for (int i = 1; i < n; i++) {
            result2 = result1 * (x / i);
            sum = sum + result2;
            result1 = result2;
        }
        return sum;
    }
    
    /**
     * prints x, e^x as determined by myexpeff, e^x as determined by Math.exp
     * for myexpeff, sums first 20 terms in infinite series expansion
     * @param double x for e^x
     */
    public static void check(double x) {
        int n = 20;
        double result1 = myexpeff(x, n);
        double result2 = Math.exp(x);
        System.out.println(x + "\t" + result1 + "\t" + result2);
    }
    
    /**
     * note that as |x| grows larger, the result from myexpeff gets more inaccurate
     * the results from myexpeff and Math.pow have fewer and fewer digits in common
     */
    public static void main(String[] args) {
        double x1 = 0.1;
        double x2 = -0.1;
        
        while (x1 <= 100) {            //shows results for 0.1, 1, 10, 100
            check(x1);
            x1 = x1 * 10;
        }
        
        while(x2 >= -100) {              //shows results for -0.1, -1, -10, -100
            check(x2);
            x2 = x2 * 10;
        }
    }
}