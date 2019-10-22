/**
 * testing what is legal by asking the compiler and seeing what exceptions are thrown
 */
public class TestLegal {
    public static int returnTwo() {
        return 2;
    }
    
    public static void main(String[] args) {
        returnTwo();                          //nothing happens with this value
        //System.out.println("Boo!") + 7;       //error: not a statement
    }
}