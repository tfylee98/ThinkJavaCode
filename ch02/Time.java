public class Time{
    public static void main(String[] args){
    int hour, minute, second;
    hour = 10;
    minute = 45;
    second = 30;
    
    int secSinceMid = second + (minute * 60) + (hour * 60 * 60);
    System.out.println(secSinceMid);
    
    int secRemaining = 86400 - second - (minute * 60) - (hour * 60 * 60);
    System.out.println(secRemaining);
    
    double totalSecInDay = 86400.0;
    double secPassed = secSinceMid;
    double percentPassed = secPassed / totalSecInDay * 100;
    System.out.println(percentPassed);
    
    hour = 10;
    minute = 54;
    second = 45;
    int newSecSinceMid = second + (minute * 60) + (hour * 60 * 60);
    int timeElapsed = newSecSinceMid - secSinceMid;
    System.out.println(timeElapsed);
    }
}