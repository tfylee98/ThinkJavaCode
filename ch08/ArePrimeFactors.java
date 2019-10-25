/**
 * tests an array a to see if the product of a's elements is n and
 * every element of a is prime
 */
public class ArePrimeFactors {
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
    
    /**
     * returns product of all elements in array
     * @param array a 
     * @result returns product
     */
    public static int product(int[] a) {
        int result = 1;
        for (int value : a) {
            result = result * value;
        }
        return result;
    }
    
    /**
     * tests if product of array is n and all elements in array are prime
     * @param int n, product of array should be n
     * @param int[] a, tests of all elements in a are prime and they multiply to equal n
     * @return true if product of array is n and all elements in array are prime
     */
    public static boolean arePrimeFactors(int n, int[] a) {
        int prod = product(a);
        boolean[] primes = sieve(n + 1);
        
        if (prod != n) {
            return false;
        }
        
        for (int i = 0; i < a.length; i++) {
            if (primes[a[i]] == false) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int[] a = new int[2];
        boolean result;
        a[0] = 2;
        a[1] = 7;
        result = arePrimeFactors(14, a);
        System.out.println(result);
    }
}
        
        