import java.util.Scanner;

/**
 * calculates Ackermann function for two user given integers: m, n
 */

public class Ack {
    
    /** 
     * Ackermann function in Java method ack
     * @param takes two integers m, n
     * @return result of Ackermann function
     */
    public static int ack(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ack(m - 1, 1);
        } else if (m > 0 && n > 0) {
            return ack(m - 1, ack(m, n - 1));
        }
        return 0;
    }
    
    public static void main(String[] args) {
        int m, n, returnVal;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ackermann function: need two nonnegative integers m and n.");
        System.out.print("m? ");
        if (!in.hasNextInt()) {              //checks if user input is integer
            String wrong = in.next();
            System.err.printf("%s is not an integer. UNACCEPTABLE!\n", wrong);
            return;
        }
        m = in.nextInt();
        if (m < 0) {                        //checks if user input is nonnegative
            System.err.printf("%d is negative. UNACCEPTABLE!\n", m);
            return;
        }
        
        System.out.print("n? ");
        if (!in.hasNextInt()) {             //checks if user input is integer
            String wrong = in.next();
            System.err.printf("%s is not an integer. UNACCEPTABLE!\n", wrong);
            return;
        }
        n = in.nextInt();
        if (n < 0) {                        //checks if user input is nonnegative
            System.err.printf("%d is negative. UNACCEPTABLE!\n", m);
            return;
        }

        returnVal = ack(m, n);
        System.out.println(returnVal);
    }
}