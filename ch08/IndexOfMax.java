import java.util.Random;
import java.util.Arrays;

/**
 * find largest element in array and return its index
 */
public class IndexOfMax {
    
    /**
     * return index of largest element in array
     * @param array of integers a
     * @return index of largest element in a
     */
    public static int indexOfMax(int[] a) {
        int index = 0;
        for (int i = 0; i < a.length - 1; i++) {       //need to use a.length - 1 because 
            if (a[index] < a[i + 1]) {                 //we use the index (i + 1)
                index = i + 1;
            }
        }
        return index;
    }
    
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[5];
        int result;
        
        //initializing array of size 5 with random integers from 0 - 9
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10);
        }
        
        result = indexOfMax(a);
        
        System.out.println(Arrays.toString(a));
        System.out.println(result);
    }
}
        
        