/**
 * class for date
 */
public class Date {
    private int year;
    private int month;
    private int day;
    
    //constructor
    public Date() {
        this.year = 2019;
        this.month = 11;
        this.day = 4;
    }
    
    //value constructor
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    //print
    public static void printDate(Date date) {
        System.out.printf("%d/%d/%d\n", date.month, date.day, date.year);
    }
    
    public static void main(String[] args) {
        Date birthday = new Date(1998, 4, 27);
        System.out.println(birthday);
        printDate(birthday);
    }
}