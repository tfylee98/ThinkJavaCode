/** 
 * checks if Fermat's Last Theorem holds
 **/
import java.util.Scanner;

public class CheckFermat {
    public static void checkFermat(int a, int b, int c, int n) {
        boolean fermat = (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n));
        if (n > 2 && fermat) {
            System.out.println("Holy smokes, Fermat was wrong!");
        } else {
            System.out.println("No, that doesn't work.");
        }
    }
    
    public static void main(String[] args) {
        int a, b, c, n;
        Scanner in = new Scanner(System.in);
        System.out.println("Testing Fermat's Last Theorem:");
        System.out.print("a? ");
        a = in.nextInt();
        System.out.print("b? ");
        b = in.nextInt();
        System.out.print("c? ");
        c = in.nextInt();
        System.out.print("n? ");
        n = in.nextInt();
        checkFermat(a, b, c, n);
    }
}