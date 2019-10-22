import java.util.Scanner;

public class CelsToFahr{
    public static void main(String[] args){
    double tempCels, tempFahr;
    final double CELS_RATIO = 9.0 / 5.0;
    final double CELS_ADD = 32;
    Scanner in = new Scanner(System.in);
    
    System.out.print("Temperature in Celsius? ");
    tempCels = in.nextDouble();
    tempFahr = tempCels * CELS_RATIO + CELS_ADD;
    System.out.printf("%.1f C = %.1f F\n", tempCels, tempFahr);
    }
}