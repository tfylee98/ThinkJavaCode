import java.util.Scanner;

/**
 * calculates sum of odd integers from 1 to n, with n being a user given odd positive integer
 */
public class OddSum {
    
    /**
     * recursively finds sum of odd integers from 1 to n
     * @param int n determines when to stop adding
     * @return returns sum
     */
    public static int oddSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return oddSum(n - 2) + n;
        }
    }
    
    public static void main(String[] args) {
        int n, value;
        Scanner in = new Scanner(System.in);
        System.out.println("Give me a positive odd integer n and I'll give you the sum of odd integers from 1 to n.");
        System.out.print("n? ");
        if (!in.hasNextInt()) {              //checks if user input is int
            String wrong = in.next();
            System.err.printf("%s is not an integer.\n", wrong);
            return;
        }
        n = in.nextInt();
        if (n <= 0 || n % 2 == 0) {              //checks if user input is positive and odd
            System.err.println("This integer is either negative or even.");
            return;
        }
        value = oddSum(n);
        System.out.println(value);
    }
}
    