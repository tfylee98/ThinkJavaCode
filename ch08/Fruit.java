/**
 * Fruit exercise.
 */
public class Fruit {
    
    /**
     * reduces array of integers a to the product of its elements
     */
    public static int banana(int[] a) {
        int kiwi = 1;
        int i = 0;
        while (i < a.length) {
            kiwi = kiwi * a[i];
            i++;
        }
        return kiwi;
    }
    
    /**
     * searches a for element whose value is equal to grape, 
     * returns the index of the matching element
     */
    public static int grapefruit(int[] a, int grape) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {
                return i;
            }
        }
        return -1;
    }
    
    /**
     * counts how many times apple shows up in a
     */
    public static int pineapple(int[] a, int apple) {
        int pear = 0;
        for (int pine: a) {
            if (pine == apple) {
                pear++;
            }
        }
        return pear;
    }

}
