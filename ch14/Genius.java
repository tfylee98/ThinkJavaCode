public class Genius extends Player {
    
    /**
     * Constructs Genius using Player constructor.
     */
    public Genius(String name) {
        super(name);
    }
    
    /**
     * Removes and returns a legal card from the player's hand.
     */
    public Card play(Eights eights, Card prev) {
        Card card = searchForMatch(prev);
        if (card == null) {
            card = drawForMatch(eights, prev);
        }
        return card;
    }

    /**
     * Searches the player's hand for a matching card.
     */
    public Card searchForMatch(Card prev) {
        int[] indexWorks = new int[getHand().size()];
        
        //Searches for an 8 first, since these cost the most points at the end of the game.
        for (int i = 0; i < getHand().size(); i++) {
            Card card = getHand().getCard(i);
            if (card.getRank() == 8) {
                return getHand().popCard(i);
            }
        }
        
        //Searches for the highest rank that works.
        Card chosenCard = new Card(0, 0);
        int index = -1;
        for (int i = 0; i < getHand().size(); i++) {
            Card card = getHand().getCard(i);
            if (cardMatches(card, prev) && card.getRank() > chosenCard.getRank()) {
                chosenCard = card;
                index = i;
            }
        }
        
        if (index != -1) {
            return getHand().popCard(index);
        } else {
            return null;
        }
    }

    /**
     * Draws cards until a match is found.
     */
    public Card drawForMatch(Eights eights, Card prev) {
        while (true) {
            Card card = eights.draw();
            //System.out.println(getName() + " draws " + card);
            if (cardMatches(card, prev)) {
                return card;
            }
            getHand().addCard(card);
        }
    }
}