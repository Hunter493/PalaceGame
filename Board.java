import java.util.*;
/**
 * Created by Tarsaril on 5/22/2016.
 */
public class Board {
    private Deck deck;
    private Card lastPlayedCard;
    private List<Card> played = new ArrayList<>();

    public Board() {
        this.deck = new Deck();
    }

    public void newGame() {
        this.deck.shuffle();
    }

    public Deck getDeck() {
        return this.deck;
    }

    public Card getLastPlayedCard() {
        return played.get(played.size() - 1);
    }

    public void addToPlayed(Card playedCard) {
        played.add(playedCard);
    }

    public boolean isPlayedEmpty() {
        return (this.played.size() == 0);
    }

    public boolean isLegal(Card card, Card previous) {
        return ((card.isBigger(previous) || card.matchesRank(previous) && card.getRank().num != 2 && card.getRank().num != 7 && card.getRank().num != 10));
    }
}
