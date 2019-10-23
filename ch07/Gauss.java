import java.util.Scanner;

/**
 * evaluate exp(-x^2) using infinite series expansion:
 * e(-x^2) = 1 - x^2 + (x^4)/2! - (x^6)/3! + ... + ((-1)^i * x^(2i))/i!
 */
public class Gauss {
    
    /**
     * evaluate exp(-x^2) using iterative method to sum first n terms of infinite series expansion
     * @param double x for exp(-x^2)
     * @param sum of first n terms of infinite series expansion
     * @return estimate of exp(-x^2) using infinite series expansion
     */
    public static double gauss(double x, int n) {
        double sum = 1.0;
        double result1 = 1.0;
        double result2 = 1.0;
        for (int i = 1; i <= n; i++) {
            result2 = (result1 * (-1) * x * x) / i;
            sum = sum + result2;
            result1 = result2;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x, result;
        int n;
        
        System.out.println("Estimate e(-x^2) with infinite series expansion.");
        System.out.print("x? ");
        while (!in.hasNextDouble()) {               //check if user input is double
            String wrong = in.next();
            System.out.printf("%s is not a double. Try again!\n", wrong);
            System.out.print("x? ");
        }
        x = in.nextDouble();
        
        System.out.println("Estimate e(-x^2) with n number of terms from the infinite series expansion.");
        System.out.print("n? ");
        while (!in.hasNextInt()) {                    //check if user input is int
            String wrong = in.next();
            System.out.printf("%s is not an integer. Try again!\n", wrong);
            System.out.print("n? ");
        }
        n = in.nextInt();
        
        if (n < 0) {                                   //check if n is nonnegative
            System.out.println("n can not be negative.");
            return;
        }
        
        result = gauss(x, n);
        System.out.println(result);
    }
}