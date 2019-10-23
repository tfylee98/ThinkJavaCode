import java.util.Scanner;

/**
 * approximates square root of a double using iterative arithmetic
 */
public class SquareRoot {
    
    /**
     * approximates square root of double by using iterative arithmetic
     * until difference between last two iterations < 0.001
     * @param approximates square root of a
     * @return last iteration
     */
    public static double squareRoot(double a) {
        double init = a / 2.0;                             //initial guess is a/2
        double guess1 = approxRoot(a, init);
        double guess2 = 0.0;
        double difference = 1.0;
        
        while (difference >= 0.0001) {
            guess2 = approxRoot(a, guess1);
            difference = diff(guess1, guess2);
            guess1 = guess2;
        }
        
        return guess2;
    }
    
    /**
     * the formula used to approximate square root
     */
    public static double approxRoot(double a, double b) {
        return (b + (a / b)) / 2.0;
    }
    
    /**
     * calculate difference between a and b
     */ 
    public static double diff(double a, double b) {
        return Math.abs(a - b);
    }
    
    public static void main(String[] args) {
        double a, result;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Approximate square root of double a.");
        System.out.print("a? ");
        while (!in.hasNextDouble()) {                           //iterate until user inputs double
            String wrong = in.next();
            System.err.printf("%s is not a double.\n", wrong);
            System.out.print("a? ");
        }
        a = in.nextDouble();

        result = squareRoot(a);
        System.out.println(result);
    }
}