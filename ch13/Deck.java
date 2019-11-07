import java.util.Arrays;
import java.util.Random;

/**
 * A deck of playing cards (of fixed size).
 */
public class Deck {

    private Card[] cards;
    public static final Random ran = new Random();

    /**
     * Constructs a standard deck of 52 cards.
     */
    public Deck() {
        this.cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                this.cards[index] = new Card(rank, suit);
                index++;
            }
        }
    }

    /**
     * Constructs a deck of n cards (null).
     */
    public Deck(int n) {
        this.cards = new Card[n];
    }

    /**
     * Gets the internal cards array.
     */
    public Card[] getCards() {
        return this.cards;
    }

    /**
     * Displays each of the cards in the deck.
     */
    public void print() {
        for (int i = 0; i < this.cards.length; i++) {
            System.out.println(this.cards[i]);
        }
    }

    /**
     * Returns a string representation of the deck.
     */
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < this.cards.length; i++) {
            str.append(this.cards[i].toString());
            if (i < this.cards.length - 1) {
                str.append("\n");
            }
        }
        return str.toString();
    }

    /**
     * Chooses a random number between low and high, including both.
     */
    public int randomInt(int low, int high) {
        int diff = high - low + 1;
        int random = ran.nextInt(diff);
        return low + random;
    }

    /**
     * Swaps the cards at indexes i and j.
     */
    public void swapCards(int i, int j) {
        Card cardi = this.cards[i];
        Card cardj = this.cards[j];
        this.cards[i] = cardj;
        this.cards[j] = cardi;
    }

    /**
     * Randomly permutes the array of cards.
     */
    public void shuffle() {
        for (int i = 0; i < this.cards.length; i++) {
            int random = randomInt(i, this.cards.length - 1);
            swapCards(i, random);
        }
    }

    /**
     * Finds the index of the lowest card
     * between low and high inclusive.
     */
    public int indexLowest(int low, int high) {
        int lowIndex = low;
        for (int i = low; i <= high; i++) {
            if (this.cards[i].compareTo(this.cards[lowIndex]) == -1) {
                lowIndex = i;
            }
        }
        return lowIndex;
    }

    /**
     * Sorts the cards (in place) using selection sort.
     */
    public void selectionSort() {
        int lowIndex = 0;
        for (int i = 0; i < this.cards.length - 1; i++) {
            lowIndex = indexLowest(i, this.cards.length - 1);
            swapCards(i, lowIndex);
        }
    }

    /**
     * Returns a subset of the cards in the deck.
     */
    public Deck subdeck(int low, int high) {
        Deck sub = new Deck(high - low + 1);
        for (int i = 0; i < sub.cards.length; i++) {
            sub.cards[i] = this.cards[low + i];
        }
        return sub;
    }

    /**
     * Combines two previously sorted subdecks.
     */
    public static Deck merge(Deck d1, Deck d2) {
        Deck merged = new Deck(d1.cards.length + d2.cards.length);
        int i = 0;
        int j = 0;
        for (int k = 0; k < merged.cards.length; k++) {
            if (i >= d1.cards.length) {
                merged.cards[k] = d2.cards[j];
                j++;
            } else if (j >= d2.cards.length) {
                merged.cards[k] = d1.cards[i];
                i++;
            } else {
                if (d1.cards[i].compareTo(d2.cards[j]) == -1) {
                    merged.cards[k] = d1.cards[i];
                    i++;
                } else {
                    merged.cards[k] = d2.cards[j];
                    j++;
                }
            }
        }
        return merged;
    }

    /**
     * Returns a sorted copy of the deck using merge sort.
     */
    public Deck mergeSort() {
        if (this.cards.length <= 1) {
            return this;
        }
        int midIndex = this.cards.length / 2;
        Deck deck1 = this.subdeck(0, midIndex - 1);
        Deck deck2 = this.subdeck(midIndex, this.cards.length - 1);
        deck1 = deck1.mergeSort();
        deck2 = deck2.mergeSort();
        Deck merged = merge(deck1, deck2);
        return merged;
    }

    /**
     * Reorders the cards (in place) using insertion sort.
     */
    public void insertionSort() {
        for (int i = 1; i < this.cards.length; i++) {
            for (int j = i; j > 0 && this.cards[j].compareTo(this.cards[j - 1]) == -1; j--) {
                swapCards(j, j - 1);
            }
        }
    }

}
