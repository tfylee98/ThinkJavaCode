import java.util.Scanner;

/**
 * perform complex arithmetic with functional decomposition
 */
public class Multadd {
    
    /**
     * @param takes three doubles a, b, c
     * @return multadd
     */
    public static double multadd(double a, double b, double c) {
        return (a * b + c);
    }
    
    /**
     * @param double x
     * @return complex arithemtic with e and square root
     */
    public static double expSum(double x) {
        double a, b, c;
        a = x;
        b = Math.exp(-x);
        c = Math.sqrt(1 - b);
        return multadd(a, b, c);
    }
        
//    public static boolean checkDouble(Scanner in) {
//        if (!in.hasNextDouble()) {
//            String value = in.next();
//            System.err.printf("%s is not a double.\n", value);
//            return false;
//        }
//        return true;
//    }
    
    public static void main(String[] args) {
        double a, b, c, a1, b1, c1, a2, b2, c2, x;
//        Scanner in = new Scanner(System.in);
//        System.out.print("a? ");
//        if (!checkDouble(in)) {
//            return;
//        }
//        a = in.nextDouble();
//        
//        System.out.print("b? ");
//        if(!checkDouble(in)) {
//            return;
//        }
//        b = in.nextDouble();
//        
//        System.out.print("c? ");
//        if(!checkDouble(in)) {
//            return;
//        }
//        c = in.nextDouble();
        a = 1.0; 
        b = 2.0; 
        c = 3.0;
        double value = multadd(a, b, c);          //simple example of multadd
        a1 = 0.5;
        b1 = Math.cos(Math.PI / 4);
        c1 = Math.sin(Math.PI / 4);
        double value1 = multadd(a1, b1, c1);       //advanced-er example of multadd
        a2 = 2.0;
        b2 = Math.log(10);
        c2 = Math.log(2);
        double value2 = multadd(a2, b2, c2);       //advanced-est example of multadd
        x = 1.0;
        double value3 = expSum(x);                 //example of expSum
        System.out.println(value + " " + value1 + " " + value2 + " " + value3);
    }
}