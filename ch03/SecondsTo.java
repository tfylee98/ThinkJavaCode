import java.util.Scanner;

public class SecondsTo{
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int seconds, numHours, numMinutes, numSeconds;
    
    System.out.print("Number of seconds? ");
    seconds = in.nextInt();
    
    numHours = seconds / 3600;
    numMinutes = seconds % 3600 / 60;
    numSeconds = seconds % 3600 % 60;
    System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds\n",
                      seconds, numHours, numMinutes, numSeconds);
    }
}