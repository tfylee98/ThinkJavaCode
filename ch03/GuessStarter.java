import java.util.Random;
import java.util.Scanner;

/**
 * Starter code for the "Guess My Number" exercise.
 */
public class GuessStarter {
    public static void main(String[] args) {
        // read in user input
        int userNum;
        Scanner in = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");
        System.out.print("Type a number: ");
        userNum = in.nextInt();
        System.out.printf("Your guess is: %d\n", userNum);
        
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.printf("The number I was thinking of is: %d\n", number);
        int diff = Math.abs(number - userNum);
        System.out.printf("You were off by: %d\n", diff);
    }
}
