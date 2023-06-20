package deckofcards;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Deck {

    private final Set<Card> cardSet;

    public Deck() {
        this.cardSet = new HashSet<>();
    }

    public Deck(List<Card> cards) {
        this();
        this.cardSet.addAll(cards);
    }

    public Set<Card> getCardSet() {
        return this.cardSet;
    }

    public int totalRemainingCards() {
        return this.cardSet.size();
    }
}
