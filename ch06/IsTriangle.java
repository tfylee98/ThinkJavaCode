import java.util.Scanner;

/** 
 * takes three integers, checks if you can form a triangle from sticks with given lengths
 */

public class IsTriangle {
    /**
     * checks if any side is greater than the sum of the other two sides
     * @param takes three integers a, b, c
     * @return false if any side is greater than the sum of the other two sides, else true
     */
    public static boolean isTriangle(int a, int b, int c) {
        if (a > (b + c)) {
            return false;
        } else if (b > (a + c)) {
            return false;
        } else if (c > (a + b)) {
            return false;
        } else {
            return true;
        }
    }
    
    /**
     * checks if user input is an integer
     * @param uses Scanner to check user input
     * @return false if user input is not an integer, else true
     */
    
    public static boolean checkInt(Scanner in) {
        if (!in.hasNextInt()) {
            String value = in.next();
            System.err.printf("%s is not an integer.\n", value);
            return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        
        System.out.println("Can we form a triangle with lengths a, b, c?");
        
        System.out.print("a? ");
        if (!checkInt(in)) {        //if a is not an integer, return and exit main
            return;
        }
        a = in.nextInt();
        
        System.out.print("b? ");
        if (!checkInt(in)) {          //same as above for b
            return;
        }
        b = in.nextInt();
        
        System.out.print("c? ");
        if (!checkInt(in)) {             //same as above for c
            return;
        }
        c = in.nextInt();
        
        boolean value = isTriangle(a, b, c);       //tests if a, b, c can form triangle
        System.out.println(value);                 //prints return boolean
    }
}