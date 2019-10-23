/**
 * iterative method of calculating factorial
 */
public class FactorialIter {

    public static void main(String[] args) {
        System.out.println(prod(3));
    }
    
    /**
     * calculates x * 1 * 2 * ... * (x - 1) = x!
     * @param calculates factorial of integer x
     * @return x!
     */
    public static int prod(int x) {
        int result = x;
        for (int i = 1; i < x; i++) {
            result = result * i;
        }
        return result;
    }
}
