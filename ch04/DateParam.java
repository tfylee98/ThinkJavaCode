public class DateParam{
    public static void printAmerican(String day, String month, int date, int year){
        System.out.println("American format:");
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }
    
    public static void printEuropean(String day, String month, int date, int year){
        System.out.println("European format:");
        System.out.println(day + " " + date + " " + month + " " + year);
    }
    
    public static void main(String[] args){
    String day, month;
    int date, year;
    day = "Friday";
    month = "October";
    date = 18;
    year = 2019;
    
    printAmerican(day, month, date, year);
    
    printEuropean(day, month, date, year);
    }
}