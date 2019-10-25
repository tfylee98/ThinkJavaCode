import java.util.Arrays;

/**
 * find largest element in an array using recursive method
 */
public class MaxInRange {    
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
    
    /**
     * finds max element in array between lowIndex and highIndex, including both
     * breaks this array into two arrays, finds max in each, and then finds max(lowArrayMax, highArrayMax)
     * @param array of integers a
     * @param lowIndex start of search
     * @param highIndex end of search
     * @return max element between lowIndex and highIndex, including both
     */
    public static int maxInRange(int[] a, int lowIndex, int highIndex) {
        int lengthRange = highIndex - lowIndex + 1;                       //# elements between lowIndex and highIndex
        int middleIndex = (int) Math.floor((lowIndex + highIndex) / 2);   //midpoint of range
        int lowArraySize = middleIndex - lowIndex + 1;                    //# elements in lowArray
        int[] lowArray = new int[lowArraySize];
        int highArraySize = lengthRange - lowArraySize;                   //# elements in highArray
        int[] highArray = new int[highArraySize];
        int lowArrayIndexMax = -1;
        int highArrayIndexMax = -1;
        int lowArrayMax, highArrayMax, actualMax;

        // if array between lowIndex and highIndex is just one element, 
        // that element must be the max
        if (lengthRange == 1) {
            return a[lowIndex];
        }
        
        // lowArray is comprised of elements in a from 0 to middleIndex
        for (int i = 0; i < lowArray.length; i++) {
            lowArray[i] = a[lowIndex + i];
        }
        
        // highArray is comprised of elements in a from (middleIndex + 1) to a.length - 1 
        for (int j = 0; j < highArray.length; j++) {
            highArray[j] = a[middleIndex + 1 + j];
        }
        
        //find index of max element in lowArray and highArray
        lowArrayIndexMax = indexOfMax(lowArray);
        highArrayIndexMax = indexOfMax(highArray);
        //find max value in lowArray and highArray
        lowArrayMax = lowArray[lowArrayIndexMax];
        highArrayMax = highArray[highArrayIndexMax];
        
        //find actual max by calculating max(lowArrayMax, highArrayMax)
        if (lowArrayMax >= highArrayMax) {
            actualMax = lowArrayMax;
        } else {
            actualMax = highArrayMax;
        }
        
        return actualMax;
    }
    
    /**
     * use maxInRange to find max of entire array
     * @param array of integers a
     * @return max of elements in a
     */
    public static int max(int[] a) {
        return maxInRange(a, 0, a.length - 1);
    }
    
    public static void main(String[] args) {
        int[] a = new int[5];
        int result;
        int lowIndex = 0;
        int highIndex = 4;
        a[0] = 55;
        a[1] = 1;
        a[2] = 27;
        a[3] = 3;
        a[4] = 54;
        result = max(a);
        System.out.println(result);
    }
}
        
            
        