import java.util.Arrays;

/**
 * using the Sieve of Eratosthenes to create an array of booleans from 0 to n-1, 
 * where prime numbers are true and nonprime numbers are false
 */
public class Sieve {
    
    /**
     * creates an array of booleans from 0 to n-1 with prime numbers marked as true
     * and nonprime numbers marked as false
     * @param n size array
     * @return array of booleans
     */
    public static boolean[] sieve(int n) {
        boolean[] result = new boolean[n];
        //want to check numbers with i^2 < n ----> i < sqrt(n)
        //thus, end for loop when i <= floor(sqrt(n))
        int endIndex = (int) Math.floor(Math.sqrt(n));      
        
        //change values from index i to (n - 1) to true
        for (int i = 2; i < n; i++) {
            result[i] = true;
        }
        
        for (int i = 2; i <= endIndex; i++) {
            //if element has already been marked false, continue to next iteration
            if (result[i] == false) {
                continue;
            }
            
            //want multiples j of i for i * j <= (n - 1)
            //thus, end for loop when j <= the number of multiples
            int numMultiple = (int) Math.floor((n - 1) / i);
            for (int j = 2; j <= numMultiple; j++) {
                result[i * j] = false;
            }
        }    
        return result;
    }
    
    public static void main(String[] args) {
        boolean[] result;
        int size = 15;
        int[] listSize = new int[size];
        result = sieve(size);
        
        for (int i = 0; i < size; i++) {
            listSize[i] = i;
        }
        
        System.out.println(Arrays.toString(listSize));
        System.out.println(Arrays.toString(result));
    }
}