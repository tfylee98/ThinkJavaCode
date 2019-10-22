/**
 * takes two integers and returns true if they're divisible, false if not
 */
import java.util.Scanner;

public class IsDivisible {
    /**
     * checks if two integers are divisible
     * @param n integer, check if divisible by m
     * @param m integer
     * @return true if n is divisible by m, false otherwise
     */
    public static boolean isDivisible(int n, int m) {
        return (n % m == 0);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Check if integer n is divisible by integer m.");
        System.out.print("n? ");
        if (!in.hasNextInt()) {                      //check if user input is int
            String notInt = in.next();
            System.err.printf("%s is not an integer.\n", notInt);
            return;
        }
        int n = in.nextInt();
        System.out.print("m? ");                     //check if user input is int
        if (!in.hasNextInt()) {
            String notInt = in.next();
            System.err.printf("%s is not an integer.\n", notInt);
            return;
        }
        int m = in.nextInt();
       
        boolean value = isDivisible(n, m);
        System.out.println(value);                   //prints return boolean from method isDivisible
    }
}
        
                