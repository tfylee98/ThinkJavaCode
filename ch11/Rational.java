/**
 * class for rational numbers, stores numerator and denominator
 */
public class Rational {
    private int num;
    private int den;
    
    //constructor
    public Rational() {
        this.num = 0;
        this.den = 1;
    }
    
    //value constructor
    public Rational(int num, int den) {
        this.num = num;
        this.den = den;
    }
    
    public void printRational() {
        System.out.printf("%d/%d\n", this.num, this.den);
    }
    
    public String toString() {
        return String.format("%d/%d", this.num, this.den);
    }
    
    //reverses sign of rational number
    public void negate() {
        this.num = this.num * -1;
    }
    
    //switches numerator and denominator
    public void invert() {
        int a = this.num;
        int b = this.den;
        this.num = b;
        this.den = a;
    }
    
    //converts to rational fraction to double
    public double toDouble() {
        double a = (double) this.num;
        double b = (double) this.den;
        return a / b;
    }
    
    //finds gcd of numerator and denominator
    public static int findGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return findGCD(num2, num1 % num2);
    }
    
    //reduces rational number to lowest terms
    public Rational reduce() {
        int gcd = findGCD(this.num, this.den);
        Rational reduced = new Rational(this.num / gcd, this.den / gcd);
        return reduced;
    }
    
    //adds two rational numbers, and reduces sum to lowest terms
    public Rational add(Rational that) {
        Rational sum = new Rational();
        int thisNum = this.num * that.den;
        int thisDen = this.den * that.den;
        int thatNum = that.num * this.den;
        sum.num = thisNum + thatNum;
        sum.den = thisDen;
        sum = sum.reduce();
        return sum;
    }
            
    public static void main(String[] args) {
        Rational test1 = new Rational(1, 5);
        Rational test2 = new Rational(3, 6);
        Rational sum = test1.add(test2);
        sum.printRational();
    }
}