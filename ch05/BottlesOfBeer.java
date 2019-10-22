/** 
 * Display entire lyrics of "99 Bottles of Beer"
 **/
import java.util.Scanner;

public class BottlesOfBeer {
    public static void bottlesOfBeer(int n) { 
        if (n != 0) { 
            bottlesOfBeer(n - 1);      // want to start at (n == 0) case
        }
        if (n == 0) {                  // first verse
            System.out.println("99 bottles of beer on the wall,");
            System.out.println("99 bottles of beer,");
            System.out.println("ya' take one down, ya' pass it around,");
            System.out.println("98 bottles of beer on the wall.");
        }
        else if (n == 99) {           // last verse
            System.out.println("No bottles of beer on the wall,");
            System.out.println("no bottles of beer,");
            System.out.println("ya' can't take one down, ya can't pass it around,");
            System.out.println("'cause there are no more bottles of beer on the wall!");
        }
        else if (n > 0) {             // middle verses
            System.out.printf("%d bottles of beer on the wall,\n", 99 - n);
            System.out.printf("%d bottles of beer,\n", 99 - n);
            System.out.println("ya' take one down, ya' pass it around,");
            System.out.printf("%d bottles of beer on the wall.\n", 99 - (n + 1));
        }
    }
    
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many bottles of beer on the wall? ");
        if (!in.hasNextInt()) {         // checking if user input is integer
            String word = in.next();
            System.err.println(word + " is not an integer.");
            return;
        }
        
        n = in.nextInt();
        if (n < 0) {                     // checking if user input is positive
            System.err.printf("%d is not a positive integer.\n", n);
            return;
        }
        else if (n > 99) {              // checking if user input is < 100
            System.err.printf("%d is not less than 100.\n", n); 
            return;
        }
        bottlesOfBeer(n);               // calling recursive method
    }
}