/**
 * class for Scrabble tile
 */
public class Tile {
    private char letter;
    private int value;
    
    //value constructor
    public Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }
    
    //print method
    public static void printTile(Tile tile) {
        System.out.printf("%c: %d\n", tile.letter, tile.value);
    }
    
    //instantiating new instance of Tile
    public static void testTile() {
        Tile tile = new Tile('Z', 10);
        printTile(tile);
    }
    
    //overloading toString method
    public String toString() {
        return String.format("%c: %d\n", this.letter, this.value);
    }
    
    //overloading equals method
    public boolean equals(Tile that) {
        return this.letter == that.letter && this.value == that.value;
    }
    
    //getters
    public char getLetter() {
        return this.letter;
    }
    
    public int getValue() {
        return this.value;
    }
    
    //setters
    public void setLetter(char letter) {
        this.letter = letter;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
}