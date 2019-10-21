import java.util.Random;
import java.util.Scanner;

/**
 * Guess My Number game with recursive method to guide user to the correct number.
 */

public class GuessRecursive{
    public static void checkNum(int userNum, int myNum){        //checks if userNum is too high/low
        if (myNum > userNum) {
            System.out.println("Too low!");
            userNum = getNum();                                 //if too low, prompts user for another number
            checkNum(userNum, myNum);                           //and then checks that number
        } else if (myNum < userNum) {
            System.out.println("Too high!");
            userNum = getNum();                                 //if too high, same as above
            checkNum(userNum, myNum);
        } else {
            System.out.println("You got it!");                  //if user is correct, program ends
        }
    }
    
    public static int getNum() {                                //gets user input
        int userNum;
        Scanner in = new Scanner(System.in);
        System.out.print("Type a number: ");
        userNum = in.nextInt();
        return userNum;
    }
    
    public static void main(String[] args) {
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");
        
        int userNum = getNum();
        Random random = new Random();                        //chooses random number from 1-99
        int myNum = random.nextInt(100) + 1;
        
        checkNum(userNum, myNum);
    }
}